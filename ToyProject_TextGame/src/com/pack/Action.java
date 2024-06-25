package com.pack;

import java.util.Scanner;

public class Action {
	Character c;
	Scanner s;
	
	public Action(Character character){
		this.c=character;
		s=new Scanner(System.in);
	}
	
	void practiceSing() {
		System.out.println("노래를 연습합니다. 능력치가 1 상승했습니다. 체력도 1 상승합니다.");
		c.sing++;
		c.physical++;
	}
	
	void practiceDance() {
		System.out.println("춤을 연습합니다. 능력치가 1 상승했습니다. 체력도 1 상승합니다.");
		c.dance++;
		c.physical++;
	}
	
	void practiceRap() {
		System.out.println("랩을 연습합니다. 능력치가 1 상승했습니다. 체력도 1 상승합니다.");
		c.rap++;
		c.physical++;
	}
	
	void successPerformace() {
		System.out.println("무대를 성공적으로 마쳤습니다!");
		System.out.println("모든 능력치가 10씩 상승합니다. 200명의 팬이 생겼습니다.");
		c.sing+=10;
		c.dance+=10;
		c.attractive+=10;
		c.rap+=10;
		c.physical+=5;
		c.fan+=200;
	}
	
	void failPerformance() {
		System.out.println("무대에서 실수를 저질렀습니다...");
		System.out.println("모든 능력치가 5씩 감소합니다. 50명의 팬이 당신에게서 등을 돌립니다..");
		c.sing-=5;
		c.dance-=5;
		c.rap-=5;
		c.attractive-=5;
		c.fan-=50;
	}
	
	void fightMembers() {
		System.out.println("같은 무대를 하는 팀원이 당신의 연습이 부족하다고 지적합니다.");
		System.out.println("당신이 무대에 피해를 주고 있다고 말합니다.");
		System.out.println("1. 미안하다고 사과한다.");
		System.out.println("2. 너는 얼마나 잘났길래 훈수질이냐고 맞서 싸운다.");
		int answer=s.nextInt();
		if(answer==1) {
			System.out.println("팀원들과 서로 사과한 후 훈훈하게 마무리됩니다.");
		}
		else if(answer==2) {
			System.out.println("당신의 주위 평판이 감소합니다.");
			c.reputation--;
		}
		System.out.println();
	}
	
}
