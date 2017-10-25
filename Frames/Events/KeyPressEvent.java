import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Frame1 extends javax.swing.JFrame {
static boolean b[]=new boolean[4];//wsad format
    public Frame1() {
        initComponents();
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key=e.getKeyCode();
                System.out.println(key);
                switch(key){
                    case 87:{
                        b[0]=true;
                        break;
                    }
                    case 83:{
                        b[1]=true;
                        break;
                    }
                    case 65:{
                        b[2]=true;
                        break;
                    }
                    case 68:{
                        b[3]=true;
                        break;
                    }
                    default:
                        for(int i=0;i<4;i++)
                            b[i]=false;
                }
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                String s=createBin();
                System.out.print(s+":::");
                int bin=Integer.parseInt(s,2);
                System.out.print(bin+":::");
                char value=(char)bin;
                System.out.println(value);
                //System.out.println(b[0]+":::"+b[1]+":::"+b[2]+":::"+b[3]);
                for(int i=0;i<4;i++)
                    b[i]=false;
            }
        });
    }
    public String createBin(){
        String str="";
        for(int i=0;i<4;i++){
            if(b[i])
                str+=1;
            else
                str+=0;
        }
        return str;
    }
    @SuppressWarnings("unchecked")                          
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        pack();
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        for(int i=0;i<4;i++)
            b[i]=false;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }
}
