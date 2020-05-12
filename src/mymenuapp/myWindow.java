package mymenuapp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class myWindow extends JFrame
{
    private JMenuBar menuBar;
    private JMenu Archivo,Edicion,Formato,Ver,Ayuda;
    private JMenuItem Nuevo,Abrir,Guardar,Imprimir,Salir;
    private JMenuItem Cortar,Copiar,Pegar;
    private JTextArea textArea;
    myWindow()
    {
        super();
        this.setTitle("Mi ventana con menú perrón");
        this.setLayout(null);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.losElementos();
        this.setJMenuBar(menuBar);
    }
    
    private void losElementos()
    {
        menuBar = new JMenuBar();
        
        Archivo = new JMenu("Archivo");
        Nuevo = new JMenuItem("Nuevo");
        
        Nuevo.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null,"Hiciste clic en Nuevo","Aviso",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        );
        
        Abrir = new JMenuItem("Abrir");
        Guardar = new JMenuItem("Guardar");
        Imprimir = new JMenuItem("Imprimir");
        Salir = new JMenuItem("Salir");
        
        Salir.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int option = JOptionPane.showConfirmDialog(null,"¿Estas seguro que deseas salir de mi aplicación perrona?","Neta morro",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(option == JOptionPane.YES_OPTION)
                {
                    System.exit(0);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Buena opción vaquero","Ohh Yesss",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        );
        
        Archivo.add(Nuevo);
        Archivo.add(Abrir);
        Archivo.add(Guardar);
        Archivo.add(Imprimir);
        Archivo.add(Salir);
        
        
        Edicion = new JMenu("Edición");
        
        Formato = new JMenu("Formato");
        
        Ver = new JMenu("Ver");
            
        Ayuda = new JMenu("Ayuda");
                    
        menuBar.add(Archivo);
        menuBar.add(Edicion);
        menuBar.add(Formato);
        menuBar.add(Ver);
        menuBar.add(Ayuda); 
        
        textArea = new JTextArea();
        textArea.setBounds(0,0,500,500);
        this.add(textArea);
        
    }
}
