public class CalculatorPro{
    
    private DadosEmpresa empresa; //Objeto da classe Empresa.
    private int qntVisuOrigin;   //Quantidade de pessoas que visualizaram o anúncio original.
    private int qntCliques;      //Quantidade de cliques feitos pelas 30 pessoas que visualizaram o anúncio original.
    private int qntCompartilham; //Quantidade de compartilhamento feito pelas 3,6 [4] pessoas que clicaram no anúncio original nas redes socias.
    private int qntComparTotal;  //Quantidade de compartilhamentos [feito pelas 3,6 [4] pessoas que clicaram no anúncio original] multiplicado pelas sequências de 4 vezes.
    private int qntVisuCompart;  //Quantidade de pessoas que visualizaram o anúncio compartilhado.
    private int qntVisuTotal;    //Quantidade de pessoas que visualizaram o anúncio.
    
    CalculatorPro(DadosEmpresa empresa){
        this.empresa = empresa;
        this.qntVisuOrigin = 30; 
        setQntCliques();
        setQntCompartilham();
        setQntComparTotal();
        setQntVisuCompart();
        setQntVisuTotal();
    }
    
    public DadosEmpresa getEmpresa(){
        return empresa;
    }
    public void setEmpresa(DadosEmpresa empresa){
        this.empresa = empresa;
    }
    
    public int getQntVisuOrigin(){
        return qntVisuOrigin;
    }
    public void setQntVisuOrigin(int qvo){
        this.qntVisuOrigin = qvo;
    }
    
    public int getQntCliques(){
        return qntCliques;
    }
    public void setQntCliques(){
        this.qntCliques = (this.getQntVisuOrigin()*12)/100;
    }
    
    public int getQntCompartilham(){
        return qntCompartilham;
    }
    public void setQntCompartilham(){   //O valor real de: a cada 3.6[4] pessoas clicam, é 0.54 compartilham. Contudo, não existe meia pessoa, por isso arredondei o valor para 1.
        if(this.qntCompartilham == 0){
            this.qntCompartilham = 1;
        }           
    }
    
    public int getQntComparTotal(){
        return qntComparTotal;
    }
    public void setQntComparTotal(){
        if(this.qntCompartilham == 1){
            this.qntComparTotal = this.getQntCompartilham()*4;
        }
    }
    
    public int getQntVisuCompart(){
        return qntVisuCompart;
    }
    public void setQntVisuCompart(){   
        if(this.qntComparTotal == 4){
            this.qntVisuCompart = (this.getQntComparTotal()*40) - this.getQntVisuOrigin();
        }
    }

    public int getQntVisuTotal(){
        return qntVisuTotal;
    }
    public void setQntVisuTotal(){   
        this.qntVisuTotal = this.getQntVisuOrigin() + this.getQntVisuCompart();
    }
    
    public int CalcularInvestimento(){
        return (int) this.getEmpresa().getValorInvestido() * this.getQntVisuTotal();
    } 
}