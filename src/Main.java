public class Main {

    public static void main(String[] args) {

        Gado gado = new Gado(1, "Nelori", true);
        System.out.println(gado);
        Gado gadoManejado = new Gado(1, "Pé duro","pasto", true);
        System.out.println(gadoManejado);
        Cao cao = new Cao(1, "PitBull", "Pet Feliz");
        System.out.println(cao);

    }


    static class Animal {
        private Integer codigo;
        private String raca;
        private String manejo;

        public Animal(Integer codigo, String raca) {
            this.codigo = codigo;
            this.raca = raca;
        }

        public Animal(Integer codigo, String raca, String manejo) {
            this.codigo = codigo;
            this.raca = raca;
            this.manejo = manejo;
        }

        public Integer getCodigo() {
            return codigo;
        }

        public void setCodigo(Integer codigo) {
            this.codigo = codigo;
        }

        public String getRaca() {
            return raca;
        }

        public void setRaca(String raca) {
            this.raca = raca;
        }

        public String getManejo() {
            return manejo;
        }

        public void setManejo(String manejo) {
            this.manejo = manejo;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "codigo=" + codigo +
                    ", raca='" + raca + '\'' +
                    ", manejo='" + manejo + '\'' +
                    '}';
        }
    }


    static class Gado extends Animal {
        private
        boolean inseminado;

        public Gado(Integer codigo, String raca, boolean inseminado) {
            super(codigo, raca);
            this.inseminado = inseminado;
        }

        public Gado(Integer codigo, String raca, String manejo, boolean inseminado) {
            super(codigo, raca, manejo);
            this.inseminado = inseminado;
        }

        public boolean isInseminado() {
            return inseminado;
        }

        public void setInseminado(boolean inseminado) {
            this.inseminado = inseminado;
        }

        @Override
        public String toString() {
            return "Gado{" +
                    "codigo=" + getCodigo() +
                    ", raca='" + getRaca() + '\'' +
                    ", manejo='" + getManejo() + '\'' +
                    ", inseminado=" + inseminado +
                    '}';
        }
    }


    static class Cao extends Animal{
        private  String racao;

        public Cao(Integer codigo, String raca, String racao) {
            super(codigo, raca);
            this.racao = racao;
        }

        public String getRacao() {
            return racao;
        }

        public void setRacao(String racao) {
            this.racao = racao;
        }

        @Override
        public String toString() {
            return "Cao{" +
                    "codigo=" + getCodigo() +
                    ", raca='" + getRaca() + '\'' +
                    ", racao='" + racao + '\'' +
                    '}';
        }
    }



}
