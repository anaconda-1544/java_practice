package exc_testcode;

public class String_mid {

	
	public int countFields(String str){
		int count = 0;
		boolean inFiled = false;
		
		
		for(int i = 0; i<str.length(); i++)
		{
			if (str.charAt(i) == ':') {
				if (!inFiled) {
					count++;
					inFiled = true;
				}
			} else {
				inFiled = false;
			}
		}
		if (str.charAt(str.length()-1) != ':')
			count++;
		
		return count;
		
	}
	
	
	
	public boolean isPalindrome(String str) {
		return isPalindromeRecursive(str,0, str.length()-1);
	}
	
	public boolean isPalindromeRecursive(String str, int left, int right) {
		if (left >= right) {
			return true;
		}
		if (str.charAt(left) != str.charAt(right))
			return false;
		
		return isPalindromeRecursive(str, left+1, right +1 );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int countFieldsa(String str) {
	    int count = 0;
	    boolean inField = false;
	    
	    for (int i = 0; i < str.length(); i++) {
	        if (str.charAt(i) == ':') {
	            if (!inField) {
	                count++;
	                inField = true;
	            }
	        } else {
	            inField = false;
	        }
	    }
	    
	    // 마지막 항목이 : 로 끝나지 않는 경우를 위해 추가 검사
	    if (str.charAt(str.length() - 1) != ':') {
	        count++;
	    }
	    
	    return count;
	}

	
	
}
