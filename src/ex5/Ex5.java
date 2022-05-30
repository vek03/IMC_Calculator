package ex5;

//importa todas as classes contidas em swing e awt
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Victor Cardoso
 * Vek Histories
 */

//sua classe herda da classe JFrame que contém todas as funções de interface
public class Ex5 extends JFrame
{
    //declarando objetos de rotulo
    JLabel rotulo1,rotulo2, exibir, exibir2, titulo1, titulo2;
    //declarando objetos de caixa de texto
    JTextField texto1,texto2;
    //declarando objeto botão de finalizar programa
    JButton calcular, limpar;
    
    //método construtor contendo todos os atributos da janela de interface
    public Ex5()
    {
        //função que chama a super classe do JFrame
        super("Calcular IMC");
        
        //Container é uma classe que contem todos os obejtos
        Container tela = getContentPane();
        
        //declara o layout como nulo para poder modificá-lo
        setLayout(null);
        
        //instancia de objetos com os valores predefinidos
        rotulo1 = new JLabel("Insira sua altura: ");
        rotulo2 = new JLabel("Insira seu peso: ");
        exibir = new JLabel("");
        exibir2 = new JLabel("");
        titulo1 = new JLabel("Calculo IMC");
        titulo2 = new JLabel("Indice de Massa Corpórea");
        
        //instancia de objetos de caixa de texto com tamanho predefinido
        texto1 = new JTextField(15);
        texto2 = new JTextField(15);
        
        //instancia do objeto botão para sair 
        calcular = new JButton("Calcular");
        limpar = new JButton("Limpar");
        
        //lugar da janela onde será impresso: margem direita, altura(de cima para baixo), tamanho em caracteres, grossura.  
        //legenda local
        titulo1.setBounds(95,20,200,20);
        titulo2.setBounds(70,35,200,20);
        rotulo1.setBounds(20,70,200,20);
        rotulo2.setBounds(20,100,200,20);
        
        //resultado local
        exibir.setBounds(20,140,500,20);
        exibir2.setBounds(20,160,500,20);
        
        //caixa de texto local
        texto1.setBounds(125,70,70,20);
        texto2.setBounds(125,100,70,20);
       
        //botões local
        calcular.setBounds(20,210,100,20);
        limpar.setBounds(150,210,100,20);
        
        titulo1.setFont(new Font("Arial", Font.BOLD, 17));
        
        //método para limpar caixas de texto
        limpar.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    exibir.setVisible(false);
                    exibir2.setVisible(false);
                    texto1.setText(null);
                    texto2.setText(null);
                    texto1.requestFocus();//passa o foco para está caixa de texto
                }
            }
        );
        
        //método para calculkar a baskara
        calcular.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    double altura, peso, IMC;
                    altura = Double.parseDouble(texto1.getText());
                    peso = Double.parseDouble(texto2.getText());
                    IMC = peso / (altura * altura);
                    exibir.setVisible(true);
                    exibir2.setVisible(true);
                    
                    if (IMC < 18.5)
                    {
                        exibir.setText("Seu IMC é: " + IMC);
                        exibir2.setText("Você está abaixo do peso");
                    }
                    else
                    {    
                        if (IMC >= 18.5 & IMC <=24.9)
                        {
                            exibir.setText("Seu IMC é: " + IMC);
                            exibir2.setText("Você está no peso ideal");
                        }
        
                        else
                        {    
                            if (IMC >= 25 & IMC <= 29.9)
                            {
                                exibir.setText("Seu IMC é: " + IMC);
                                exibir2.setText("Você está com sobrepeso");
                            }
        
                            else
                            {
                                if (IMC >= 30 & IMC <= 34.9)    
                                {
                                    exibir.setText("Seu IMC é: " + IMC);
                                    exibir2.setText("Você está com Obesidade de Grau I");
                                }
        
                                    else
                                    {
                                        if (IMC >= 35 & IMC <= 39.9)
                                        {
                                            exibir.setText("Seu IMC é: " + IMC);
                                            exibir2.setText("Você está com Obesidade de Grau II");
                                        }    
        
                                        else
                                        {
                                            exibir.setText("Seu IMC é: " + IMC);
                                            exibir2.setText("Você está com Obesidade de Grau III");
                                        }
                                    }    
                            }    
                        }
                    }
                }    
            }
        );
          
        
        //visibilidade do resultado apenas quando calculo for efetuado
        exibir.setVisible(false);
        exibir2.setVisible(false);
        
        //exibição de tudo
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(exibir);
        tela.add(exibir2);
        tela.add(titulo1);
        tela.add(titulo2);
        
        tela.add(texto1);
        tela.add(texto2);
        
        tela.add(calcular);
        tela.add(limpar);
        
        //declarando o tamanho em que a janela deve abrir
        setSize(300, 300);
        
        //visibilidade da janela
        setVisible(true);
        
        //define o local do monitor em que será aberta a janela
        setLocationRelativeTo(null);
    }
    
    //método main
    public static void main(String[] args) 
    {
        //intância de objeto(classe com os atributos)
        Ex5 app = new Ex5();
        //chamando a janela
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
