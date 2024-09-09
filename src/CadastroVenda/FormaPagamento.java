package CadastroVenda;

public enum FormaPagamento {

    credito {
        @Override
        public double desconto(double valor) {
            return valor-(valor*0.5);
        }

    },
    debito {
        @Override
        public double desconto(double valor) {
            return valor-(valor*0.2);
        }

    },
    dinheiro {
        @Override
        public double desconto(double valor) {
            return valor-(valor*0.1);
        }

    };

    public abstract double desconto(double valor);
}
