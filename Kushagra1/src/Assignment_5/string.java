package Assignment_5;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
		int n=30;
		String strf=str.substring(0,n);
        String strl=str.substring(0,n);
        for(int i=0;i<str.length()-n+1;i++){
            String str1=str.substring(i,i+n);
            for(int j=0;j<n;j++){
            	char ch=str1.charAt(j);
            	char ch1=strf.charAt(j);
            	if(ch>='A' && ch<='Z') {
            		ch=(char) ((int)ch+32);
            	}
            	if(ch1>='A' && ch1<='Z') {
            		ch1=(char) ((int)ch1+32);
            	}
                if(ch<ch1){
                    strf=str1;
                    break;
                }
                else{
                    break;
                }
            }
            for(int j=0;j<n;j++){
            	char ch=str1.charAt(j);
            	char ch1=strl.charAt(j);
            	if(ch>='A' && ch<='Z') {
            		ch=(char) ((int)ch+32);
            	}
            	if(ch1>='A' && ch1<='Z') {
            		ch1=(char) ((int)ch1+32);
            	}
                if(ch>ch1){
                    strl=str1;
                    break;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(strf);
        System.out.println(strl);
		
	}

}
