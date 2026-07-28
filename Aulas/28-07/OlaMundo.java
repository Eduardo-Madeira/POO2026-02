public class OlaMundo {
    void main(){
        System.out.println("Olá Mundo");

        String nome = IO.readln("Entre com seu nome: ");

        int a = Integer.parseInt(IO.readln("Entre com um  número: "));

        char sexo = IO.readln("Informe seu sexo (f/m): ").charAt(0);

        int idade = Integer.parseInt(IO.readln("Informe sua idade: "));

        if (idade > 18) {
           System.err.println("Você não precisa apresentar Atestado de Reservista!"); 
        } else if(idade < 18) {
            if (sexo == 'f' && sexo == 'F'){
                System.out.println("Você não precisa apresentar Atestado de Reservista, somente caso tenha se alistado.");
            } else {
            System.out.println("Apresente seu Atestado de Reservista!");
            }
        }
    }
}