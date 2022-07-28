package bm06;

public class ContaSimplificada {
        private String nome;
        private float saldo;
        private boolean especial;


        public boolean abrirConta(String nome, float saldo, boolean especial){
            if (saldo < 100){
                System.out.println("Saldo deve estar acima de R$ 100");
                return false;
            }else{
                this.nome = nome;
                this.saldo = saldo;
                this.especial = especial;
                return true;
            }
        }


        public void deposita(float valor){
            saldo = saldo +valor;
        }

        public boolean saque(float valor){
            if(valor > saldo && !especial){
                return false;
            }else{
                saldo -= valor;
                return true;
            }

        }

        public void mostradados(){

            System.out.print("O nome do correntista é ");
            System.out.println(nome);
            System.out.print("O saldo é ");
            System.out.println(saldo);
            if(especial){
                System.out.println("A conta é especial.");
                if(saldo < 0){
                    System.out.println("Sua conta está negativa");
                }
            }
            else{
                System.out.println("A conta é comum ");
            }

        }



}
