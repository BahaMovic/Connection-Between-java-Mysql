/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1117
 */
public class FakeCoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] op = new int[100];
        for(int i=0; i<100;i++){
            if(i!=12){
                op[i]=5;
            }
        }
        op[2] = 4;
        
        int sum1 = 0;
        int sum2 = 0;
        int l = op.length -1;
        for(int x=0 ; x< op.length/2 ; x++){
            sum1 += op[x];
            sum2 += op[l];
            
        }
        int sum3 = 0;
        int sum4 = 0;
        int ll = (op.length-1)/2;
        if(sum1<sum2){
           for(int z =0 ; z<op.length/4 ; z++){
                sum3 += op[z];
                sum4 += op[ll];
                ll--;
           }
        }int  sum5=0;
            int sum6=0;
        if(sum3<sum4){
            
             int lll = (op.length)/4;
           for (int x1=0; x1<op.length/8;x1++){
               sum5 += op[x1];
               sum6 += op[lll];
               lll--;
               
           }
        }
        int sum7 = 0;
        int sum8 = 0;
        int llll = op.length/8;
        if(sum5<sum6){
            for(int xx=0; xx<op.length/16;xx++){
                sum7 += op[xx];
                sum8 +=op[llll];
                llll--;
            }
           
        }
        int sum9 = 0;
        int sum10 = 0;
        int l_ = op.length/16;
        if(sum8<sum7){
            for(int xz=0 ; xz<op.length/32 ; xz++){
                sum9 += op[xz];
                sum10 += op[l_];
                l_ --;
                        
            }
            
        }
        if(sum9<sum10){
            for(int xc = 0; xc<3 ; xc++){
                 for(int xc1 = 0; xc1<xc ; xc1++){
                if(op[xc]<op[xc1]){
                    System.out.println(xc);
                }
            }
            }
        }
    }
}