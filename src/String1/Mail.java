package String;

public class Mail {

    public boolean Check(String[] mails, String mail){
       
        /*
        int n;
        if(mail.contains("@")){} 
        else return false;
        n=mail.indexOf("@");
          */      
        
        /*
        if (!m.Check(mails, s1)){
            JOptionPane.showMessageDialog(null,"You have entered an incorrect mail");
        }
        else if (s3.length()<6){
	JOptionPane.showMessageDialog(null,"the password is not secure");
	}
        else {
		NFrame n= new NFrame();
		
		
	}
        */
                
                
        
        
        for(int i=0;i<mails.length;i++){
            if(mail.contains(mails[i]))
                return true;}
             return false;
   
    }
    
    
    
    
}
    

