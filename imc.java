import java.util.Scanner; 

public class imc
{

    public static void main(String[] args)
    {
 
        Scanner input =  new Scanner(System.in);

        float altura, 
        peso,
        imc,
        n;

        System.out.println (" Insira a sua altura: ");
        altura = input.nextFloat();
        n = (altura * altura);

        System.out.println (" Insira a seu peso: ");
        peso = input.nextFloat();
        imc = (peso / n);

        if(imc <= 18.5){
        System.out.println (" Você está abaixo do peso normal!! ");
    }
        if(imc >= 18.5 && imc <= 25 ){
        System.out.println (" Você está com o peso normal!! ");
    }
        if(imc >= 25 && imc <= 30){
        System.out.println (" Você esá acima do peso normal!! ");
    }
        if(imc >= 30 && imc <= 34.9){
        System.out.println (" Você está no nível de obesidade grau I!! ");
    }
     if(imc >= 35.0 && imc <= 40.0){
        System.out.println (" Você está no nível de obesidade grau II!! ");
    }
     if(imc > 40.0){
        System.out.println (" Você está no nível de obesidade grau III!! ");
    }

        
        System.out.println(imc);
    

}
}