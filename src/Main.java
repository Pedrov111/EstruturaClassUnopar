public class Main {
    public static void main(String[] args) {
        Gado gado = new Gado(101, "Nelori", true);
        System.out.println(gado);

        Cao cao = new Cao(101, "Nelori", "Pet Feliz");
        System.out.println(cao);

    }


    static class Animal {

        private Integer codigo;
        private String nome;
        private  String manejo;

        public Animal(Integer codigo, String nome, String manejo) {
            this.codigo = codigo;
            this.nome = nome;
            this.manejo = manejo;
        }

        public Animal(Integer codigo, String nome) {
            this.codigo = codigo;
            this.nome = nome;
        }

        public Integer getCodigo() {
            return codigo;
        }

        public void setCodigo(Integer codigo) {
            this.codigo = codigo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }


    static class Gado extends Animal {

        private boolean inseminado;

        public Gado(Integer codigo, String nome, boolean inseminado) {
            super(codigo, nome);
            this.inseminado = inseminado;
        }

        public boolean isInseminado() {
            return inseminado;
        }

        public void setInseminado(boolean inseminado) {
            this.inseminado = inseminado;
        }
    }

    static class Cao extends Animal {

        private String racao;

        public Cao(Integer codigo, String nome, String racao) {
            super(codigo, nome);
            this.racao = racao;
        }

        public String getRacao() {
            return racao;
        }

        public void setRacao(String racao) {
            this.racao = racao;
        }
    }


}
