package ControlStatements;

public class break_Label {
public static void main(String[] args) {
	

lable:
	for(int i=1;i<=3;i++){
		for(int j=1;j<=3;j++){
			System.out.println(i+""+j+ " ");
			if(i==2)
				break lable;
		}
	}
}
}
