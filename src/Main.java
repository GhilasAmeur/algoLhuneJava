//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println(verifierCaretBanque("2424242424242423"));

    }

    public static boolean verifierCaretBanque(String numero){

        String [] tableauDeChiffre = numero.split("");

        int tailleDeNumero = String.valueOf(numero).length();
        String nv_numero ="";
        int somme = 0;

        if(tailleDeNumero< 16){
            return false;
        }

        if(tailleDeNumero % 2 == 0){

            for (int i = 0; i < tableauDeChiffre.length;i++ ) {

                if(i % 2 == 0){

                    int chiffre2 =  Integer.parseInt(tableauDeChiffre[i]) * 2;

                        if (chiffre2 > 9){
                            int nv_chiffre = chiffre2 - 9;
                            nv_numero += nv_chiffre;
                        }else{
                            nv_numero += Integer.parseInt(tableauDeChiffre[i])  * 2;
                        }
                }else{
                    nv_numero  +=  Integer.parseInt(tableauDeChiffre[i]);
                }
            }

        }

        if(tailleDeNumero % 2 != 0){

            for (int i = 0; i < tableauDeChiffre.length;i++ ) {

                if(i % 2 != 0){

                    int chiffre2 =  Integer.parseInt(tableauDeChiffre[i]) * 2;

                    if (chiffre2 > 9){
                        int nv_chiffre = chiffre2 - 9;
                        nv_numero += nv_chiffre;
                    }else{
                        nv_numero += Integer.parseInt(tableauDeChiffre[i])  * 2;
                    }
                }else{
                    nv_numero  +=  Integer.parseInt(tableauDeChiffre[i]);
                }
            }

        }
        for (int i = 0; i < nv_numero.length(); i++) {

            somme += Character.getNumericValue(nv_numero.charAt(i));
        }

        return somme % 10 == 0;

    }
}