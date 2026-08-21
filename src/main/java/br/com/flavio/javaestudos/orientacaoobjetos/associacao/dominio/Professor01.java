package br.com.flavio.javaestudos.orientacaoobjetos.associacao.dominio;

public class Professor01 {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor01(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor01(Seminario[] seminarios, String especialidade, String nome) {
        this.seminarios = seminarios;
        this.especialidade = especialidade;
        this.nome = nome;
    }
    public void imprime(){
        System.out.println("---------");
        System.out.println("Professor:"+this.nome);
        if (this.seminarios==null)return;
        System.out.println("Seminarios:");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println("Local:"+seminario.getLocal().getLocal());
            if (seminario.getAlunos()==null)continue;
            System.out.println("Alunos:");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Nome:"+aluno.getNome()+"||idade:"+aluno.getIdade());
            }

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
