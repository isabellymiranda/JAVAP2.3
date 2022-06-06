public class Principal {
    public static void main(String[] args) {
        PessoaFisica PessoaFisica = new PessoaFisica();
        PessoaJuridica PessoaJuridica = new PessoaJuridica();
   
        // Inserir informações pelo método SET
        PessoaFisica.setCPF("691.158.768-87");
        PessoaFisica.setNome("Luis");
        PessoaFisica.setEndereco("Tupã-SP");
   
        PessoaJuridica.setCNPJ("85.896.988/00001-87");
        PessoaJuridica.setNome("Ronaldo");
        PessoaJuridica.setEndereco("Tocantins-TO");
   
   
        // Exibir informações pelo método GET
        System.out.println("\nInformações de " + PessoaFisica.getNome() + ":");
        System.out.println("CPF:" + PessoaFisica.getCPF() + ".");
        System.out.println("Endereço:" + PessoaFisica.getEndereco() + ".");
   
   
        System.out.println("\nInformações de " + PessoaJuridica.getNome() + ":");
        System.out.println("CPF:" + PessoaJuridica.getCNPJ() + ".");
        System.out.println("Endereço:" + PessoaJuridica.getEndereco() + ".");
    }   
   }