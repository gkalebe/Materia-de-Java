public static class Data{
    private int mes;
    private int dia;
    private int ano;

        public Data(int mes, int dia, int ano){
            this.mes = mes;
            this.dia = dia;
            this.ano = ano;
        }

            public void setMes(int mes){
                this.mes = mes;
            }   

                public int getMes(){
                    return mes;
                }

                    public void setDia(int dia){
                        this.dia = dia;
                    }
                        
                        public int getDia(){
                            return dia;
                        }

                            public void setAno(int ano){
                                this.ano = ano;
                            }

                                public int getAno(){
                                    return ano;
                                }

                                    public void displayDate(){
                                        System.out.println(mes + "/" + dia + "/" + ano);
                                    }
}