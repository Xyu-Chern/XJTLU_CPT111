public class lab2 {
    public static void main(String[] args){
        System.out.println(warAndPeace("there was never a good war, or a bad peace"));
        System.out.println(warAndPeace("war what is it good for"));
        
    }

    public static boolean warAndPeace(String text){
        String war ="war";
        String peace ="peace";
        int m_p=0;
        int m_w=0;
        int sum_p=0;
        int sum_w=0;
        int bra =0;
        while(bra!=-1&&m_p<text.length()){
            m_p=text.indexOf(peace,m_p);
            // System.out.print(m_p);
            sum_p++;
            bra =m_p;
            m_p++;
        }
        // System.out.println(sum_p);
        bra =0;
        while(bra!=-1&&m_w<text.length()){
            m_w=text.indexOf(war,m_w);
            sum_w++;
            bra =m_w;
            m_w++;
        }
        // System.out.println(sum_w);
                

           
        return sum_p==sum_w;
    }


    
}

    

