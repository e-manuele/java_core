public class Operator {
    String name;
    char value;
    int res;

    public Operator(String name,char value){
        this.name = name;
        this.value= value;
    }
    public Operator(String name){

        switch (name){
            case "somma": this.value= '+';
            case "moltiplicazione": this.value= '*';
            case "divisione": this.value= '/';
            case "sottrazione": this.value= '-';

        }
    }

/*
    public Integer doOperation(int a, int b){
        return switch (this.value) {
            case '+':  a + b;
            case '*':  a * b;
            case '/':  a / b;
            case '-' :
                int i = a - b;
                default -> null;
        };
    }
*/


}
