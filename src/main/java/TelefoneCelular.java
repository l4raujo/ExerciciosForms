public class TelefoneCelular {
    public static void main(String[] args) {
        class Telefone {
            private String marca;
            private String modelo;
            private String cor;
            private double preco;
            private int armazenamento;

            public String getMarca() {
                return marca;
            }

            public void setMarca(String marca) {
                this.marca = marca;
            }

            public String getModelo() {
                return modelo;
            }

            public void setModelo(String modelo) {
                this.modelo = modelo;
            }

            public String getCor() {
                return cor;
            }

            public void setCor(String cor) {
                this.cor = cor;
            }


            public double getPreco() {
                return preco;
            }


            public void setPreco(double preco) {
                this.preco = preco;
            }

            public int getArmazenamento() {
                return armazenamento;
            }

            public void setArmazenamento(int armazenamento) {
                this.armazenamento = armazenamento;
            }


            public void exibirInformacoes() {
                System.out.println("Marca: " + getMarca());
                System.out.println("Modelo: " + getModelo());
                System.out.println("Cor: " + getCor());
                System.out.println("Preço: " + getPreco());
                System.out.println("Armazenamento: " + getArmazenamento() + "GB");
            }
        }

        Telefone telefone1 = new Telefone();
        telefone1.setMarca("Motorola");
        telefone1.setModelo("Moto G3");
        telefone1.setCor("Vermelho");
        telefone1.setPreco(500);
        telefone1.setArmazenamento(32);
        telefone1.exibirInformacoes();
    }
}
