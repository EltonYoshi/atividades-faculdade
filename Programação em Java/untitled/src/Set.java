public class Set {
    private Time time1;
    private Time time2;

    public Set(){
        //criacao de associacao e construtor
        this.time1 = new Time();
        this.time2 = new Time();
    }
    public void getTime1(){
        return time1;
    }
    public void setTime1(){
        this.time1 = time1;
    }
    public void getTime2(){
        return time2;
    }
    public void setTime2(){
        this.time2 = time2;
    }


    //obtem a quantidade de pontos de cada time e armazena nas variáveis
    public boolean continuarSet() {
        int pt1 = this.time1.getPontos();
        int pt2 = this.time2.getPontos();
        //Após isso , temos um if que testa se algum time  atingiu a pontuação para vencer
        if(pt1 > pt2 && pt1 - pt2 >= 2 && pt1 >= 25 || pt2 > pt1 && pt2 - pt1 >= 2 &&  pt2 >= 25){
            return false;
        }else {
            return true;
        }
    }
    //retorna o vencedor e o perdedor
    public Time obterVencedor(){
        int pt1 = this.time1.getPontos();
        int pt2 = this.time2.getPontos();
        if(pt1 > pt2){
            return this.time1;
        }else {
            return this.time2;
        }
    }
    @Override
    public String toString(){
        return "Time 01: "+ this.time1 + "\nTime 02: "+ this.time2;
    }
}
