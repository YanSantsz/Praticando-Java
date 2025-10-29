package HerancaPolimorfismoInterfaces.Entidades.GerenciamentoBiblioteca;

abstract class Midia {
    protected String titulo;
    protected int anoPublicacao;
    protected String codigo;

    public Midia(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.codigo = gerarCodigo();

    }

    protected String gerarCodigo(){
        String tituloLimpo = titulo.trim();
        String prefixoTitulo;

        if (tituloLimpo.length() >= 3) {
            prefixoTitulo = tituloLimpo.substring(0, 3).toUpperCase();
        } else {
            prefixoTitulo = tituloLimpo.toUpperCase();
        }

        return "LIB-" + prefixoTitulo + anoPublicacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public abstract void exibirInfo();
}
