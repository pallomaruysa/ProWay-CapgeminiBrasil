public class Calculadora{
    
    private int qntVisuOrigin;    
    private int qntCliques;      
    private int qntCompartilham; 
    private int qntComparTotal; 
    private int qntVisuCompart;  
    private int qntVisuTotal;    
    
    Calculadora(){
        this.qntVisuOrigin = 30; 
        this.qntCliques = (this.getQntVisuOrigin()*12)/100;
        setQntCliques();
        setQntCompartilham();
        setQntComparTotal();
        setQntVisuCompart();
        setQntVisuTotal();
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
        if(this.qntCliques == 3 || this.qntCliques == 3.6){
            this.qntCliques = 4;
        }
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
    
}