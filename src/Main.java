public class Main {
    public static void main(String[] args) {
        // Dados do Ryan
        //id = idade
        // alt = altura
        // estu =  estudante

        String nome = "Ryan";
        int id = 28;
        double alt = 1.75;
        boolean ehstudante = true;

        // dados da Isabela
        String nome2 = "Isabela";
        int id2 = 19;
        double alt2 = 1.63;
        boolean est2 = true;

        //Operações
        //somaDasId = soma das duas idades
        //duplalt = altura duplicada
        int somaDasId = id + id2;
        double duplalt = alt * 2;

        //Exebição dos resultados
        System.out.println("Olá sou o " +nome);
        System.out.println("A soma da minha idade e a da Isabela é " + somaDasId);
        System.out.println("Minha altura multiplicada por dois é " +duplalt);
        System.out.println(" é estudante ? " +ehstudante);

    }
}