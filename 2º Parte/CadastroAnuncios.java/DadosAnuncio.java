public class DadosAnuncio{
    
    private DadosCliente cliente;
    private String nomeAnuncio; 
    private String dataInicial;
    private String dataFinal;
    private int qntDias;
    private double valorInvestido;
    
    DadosAnuncio(DadosCliente cliente, String nome, String dtInicial, String dtFinal, int qntDias, double val_Invest){
        this.cliente = cliente;
        this.nomeAnuncio = nome;
        this.dataInicial = dtInicial;
        this.dataFinal = dtFinal;
        this.qntDias = qntDias;
        this.valorInvestido = val_Invest;
    }
    DadosAnuncio(){
        
    }
    
    public DadosCliente getCliente(){
        return cliente;
    }
    public void setCliente(DadosCliente cliente){
        this.cliente = cliente;
    }
    
    public String getNomeAnuncio(){
        return nomeAnuncio;
    }
    public void setNomeAnuncio(String nome){
        this.nomeAnuncio = nome;
    }
   
    public String getDataInicial(){
        return dataInicial;
    }
    public void setDataInicial(String dtInicial){
        this.dataInicial = dtInicial;
    }
    
    public String getDataFinal(){
        return dataFinal;
    }
    public void setDataFinal(String dtFinal){
        this.dataFinal = dtFinal;
    }
    
    public int getQntDias(){
        return qntDias;
    }
    public void setQntDias(int qntDias){
        this.qntDias = qntDias;
    }
    
    public double getValorInvestido(){
        return valorInvestido;
    }
    public void setValorInvestido(double val_Invest){
        this.valorInvestido = val_Invest;
    }

}