public class DeveloperPro{
    
    private DadosAnuncio anuncio; 
    private Calculadora calculos;
    private double valorInvestidoTotal;
    private int visualizacaoMax;
    private int cliquesMax;
    private int compartMax;

    
    DeveloperPro(DadosAnuncio anuncio){
        this.anuncio = anuncio;
        setValorInvestidoTotal();
        setVisualizacaoMax();
        setCliquesMax();
        setCompartMax();
        
    }
    
    public DadosAnuncio getAnuncio(){
        return anuncio;
    }
    public void setAnuncio(DadosAnuncio anuncio){
        this.anuncio = anuncio;
    }
    
    public Calculadora getCalculos(){
        return calculos;
    }
    public void setCalculos(Calculadora calculos){
        this.calculos = calculos;
    }
    
    public double getValorInvestidoTotal(){
        return valorInvestidoTotal;
    }
    public void setValorInvestidoTotal(){
        this.valorInvestidoTotal = this.getAnuncio().getValorInvestido() * this.getAnuncio().getQntDias();
    }
    
    public int getVisualizacaoMax(){
        return visualizacaoMax;
    } 
    public void setVisualizacaoMax(){
        this.getAnuncio().getValorInvestido() * this.getCalculos().getQntVisuTotal();
    }
    
    public int getCliquesMax(){
        return cliquesMax;
    } 
    public void setCliquesMax(){
        (this.getVisualizacaoMax() * this.getCalculos().getQntCliques()) / this.getCalculos().getQntVisuOrigin();
    }
    
    public int getCompartMax(){
        return compartMax;
    } 
    public void setCompartMax(){    //Para 40 pessoas que visualizam 1 compartilha, logo dividindo a quantidade max de visualizações por 40 encontramos o valor de compartilhamento máximo.
        this.getVisualizacaoMax() / 40;
    }
    
}