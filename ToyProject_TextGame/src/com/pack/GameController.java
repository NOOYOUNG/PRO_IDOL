package com.pack;

import java.util.Scanner;

import com.pack.Character;

public class GameController {
	Character ch;
	Action action;
	Scanner s;
	
	public GameController() {
		ch=new Character();
		action=new Action(ch);
		s=new Scanner(System.in);
	}
	
	void intro() {
		System.out.println("~~~게임을 시작합니다!~~~");
		System.out.print("플레이어의 이름을 입력하세요:");
		ch.name=s.nextLine();
		System.out.println("당신의 성별은 무엇입니까?");
		System.out.println("1. 여자\t\t2. 남자");
		int gender=s.nextInt();
		
		System.out.println(ch.name+", 당신은 데뷔를 직전에 둔 연습생입니다.");
		System.out.println("회사의 연습생을 담당하는 실장님이 당신을 호출했습니다.");
		System.out.println("당신은 문을 두드립니다. 들어오라는 허락이 떨어집니다.");
		
		System.out.println("\""+ch.name+", 너는 이번 데뷔조에 합류하지 못하게 됐어.\"");
		System.out.println("\"그래서 말인데... 너에게 기회를 한 번 더 주려고 해.\"");
		if(gender==1)
			System.out.println("\"이번에 JAVANET에서 열리는 신인 여자 아이돌 그룹 데뷔 프로그램에 나가보는게 어떄?\"");
		else if(gender==2)
			System.out.println("\"이번에 JAVANET에서 열리는 신인 남자 아이돌 그룹 데뷔 프로그램에 나가보는게 어떄?\"");
		
		while(true) {
			System.out.println("1. 예\t\t2. 아니오");
			int answer=s.nextInt();
			if(answer==1) {
				gameStart();
				break;
			}
			else if(answer==2) {
				System.out.println("당신은 데뷔를 포기했습니다.");
				System.out.println("게임을 종료합니다.");
				return;
			}
			else {
				System.out.println("알맞은 숫자를 입력하세요.");
			}
		}			
	}
	
	void gameStart() {
		System.out.println();
		System.out.println("가수의 꿈을 버리지 않은 당신! 당신의 눈앞에 상태창이 나타납니다.");
		ch.info();
		System.out.println("가수로 데뷔하기 위해서는 이번 서바이벌을 통해 모든 능력치가 최소 C등급보다 높아야 하고, 특정 능력치 하나 이상은 A등급 이상이어야 합니다. 또한, 1000명 이상의 팬을 확보하는 것이 관건입니다.");
		System.out.println("게임이 진행되며 선택지를 고름에 따라 능력치가 높아지거나 낮아질 수 있습니다.");
		
		try {
		    Thread.sleep(2000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		System.out.println();
		selfIntroduce();
	}
	
	void selfIntroduce() {
		int answer;
		int answer2;

		System.out.println("<1분 자기소개 시간>");
		System.out.println("1화가 방영되기 전, 시청자들에게 눈도장을 찍을 수 있는 기회입니다.");
		System.out.println("당신은 무엇을 보여주겠습니까?");
		System.out.println("1. 노래\t\t2. 춤\t\t3. 랩\t\t4. 애교");
		
		answer=s.nextInt();
		if(answer==1) {
			System.out.println("당신은 노래를 선택했습니다.");
			System.out.println("자기소개 영상 촬영 전 연습을 하시겠습니까?");
			System.out.println("1. 예\t\t2. 아니오");
			answer2=s.nextInt();
			if(answer2==1) {
				action.practiceSing();
				System.out.println("축하합니다! 50명의 팬이 당신에게 관심을 가집니다");
				ch.fan+=50;
			} else if(answer2==2) {
				System.out.println("당신은 아무 노력도 하지 않았습니다.");
				System.out.println("당신의 영상에 관심을 가지는 팬이 없습니다.");
			} else {
				System.out.println("알맞은 숫자를 입력하세요.");
			}
		}
		else if(answer==2) {
			System.out.println("당신은 춤을 선택했습니다.");
			System.out.println("자기소개 영상 촬영 전 연습을 하시겠습니까?");
			System.out.println("1. 예\t\t2. 아니오");
			answer2=s.nextInt();
			if(answer2==1) {
				action.practiceDance();
				System.out.println("축하합니다! 50명의 팬이 당신에게 관심을 가집니다");
				ch.fan+=50;
			} else if(answer2==2) {
				System.out.println("당신은 아무 노력도 하지 않았습니다.");
				System.out.println("당신의 영상에 관심을 가지는 팬이 없습니다.");
			} else {
				System.out.println("알맞은 숫자를 입력하세요.");
			}
		}
		else if(answer==3) {
			System.out.println("당신은 랩을 선택했습니다.");
			System.out.println("자기소개 영상 촬영 전 연습을 하시겠습니까?");
			System.out.println("1. 예\t\t2. 아니오");
			answer2=s.nextInt();
			if(answer2==1) {
				action.practiceRap();
				System.out.println("축하합니다! 50명의 팬이 당신에게 관심을 가집니다");
				ch.fan+=50;
			} else if(answer2==2) {
				System.out.println("당신은 아무 노력도 하지 않았습니다.");
				System.out.println("당신의 영상에 관심을 가지는 팬이 없습니다.");
			} else {
				System.out.println("알맞은 숫자를 입력하세요.");
			}
		}
		else if(answer==4) {
			System.out.println("당신은 애교를 선택했습니다.");
			System.out.println("이럴수가... 당신의 애교에 현장마저 썰렁해집니다.");
			System.out.println("하지만 이번 도전을 통해 매력도가 1 증가했습니다.");
			System.out.println("놀랍게도 당신에게 관심을 가지는 30명의 팬이 생겼습니다.");
			ch.attractive++;
			ch.fan+=30;
		}
		
		System.out.println();
		ch.info();
		
		try {
		    Thread.sleep(2000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		System.out.println();
		chooseCenter();		
	}
	
	void chooseCenter() {
		int answer;
		
		System.out.println("서바이벌 프로그램의 꽃! 센터 선발전입니다.");
		System.out.println("선발전이 시작되기 전까지는 3일이 남았습니다.");
		System.out.println("당신은 얼마나 연습을 하시겠습니까?");
		System.out.println("1. 매일 연습한다.\t\t2. 이틀만 연습한다.\t\t3. 하루만 연습한다.\t\t4. 연습하지 않는다.");
		answer=s.nextInt();
		
		if(answer==1) {
			System.out.println("당신은 매일 연습했습니다.");
			System.out.println("노래와 춤과 랩의 능력치가 3씩 증가합니다. 체력도 3증가합니다.");
			ch.sing+=3;
			ch.dance+=3;
			ch.rap+=3;
			ch.physical+=3;
		}
		else if(answer==2) {
			System.out.println("당신은 이틀 동안 연습했습니다.");
			System.out.println("노래와 춤과 랩의 능력치가 2씩 증가합니다. 체력도 2증가합니다.");
			ch.sing+=2;
			ch.dance+=2;
			ch.rap+=2;
			ch.physical+=2;
		}
		else if(answer==3) {
			System.out.println("당신은 하루 동안 연습했습니다.");
			System.out.println("노래와 춤과 랩의 능력치가 1씩 증가합니다. 체력도 1증가합니다.");
			ch.sing++;
			ch.dance++;
			ch.rap++;
			ch.physical++;
		}
		else if(answer==4) {
			System.out.println("당신은 아무 노력도 하지 않았습니다.");
		}
		
		try {
		    Thread.sleep(1000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("-센터 선발전 당일-");
		System.out.println(ch.sing+"/"+ch.dance+"/"+ch.attractive+"/"+ch.physical+"/"+ch.fan);
		
		if(ch.sing>=7 || ch.dance>=7 ||ch.rap>=7) {
			action.successPerformace();
			System.out.println("성공적으로 무대를 마친 당신의 매력도가 3만큼 추가로 상승합니다.");
			ch.attractive+=3;
		}
		else if(ch.sing<5 && ch.dance<5){
			action.failPerformance();
		}
		else {
			System.out.println("무대를 마쳤습니다.");
		}
		
		System.out.println();
		ch.info();
		
		try {
		    Thread.sleep(2000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		System.out.println();
		firstMatch();
	}
	
	void firstMatch() {
		int answer;
		int days;
		
		System.out.println("1차 평가전이 시작되었습니다.");
		System.out.println("무대 콘셉트는 큐트, 섹시, 청량입니다.");
		System.out.println("어떤 콘셉트로 무대를 진행하겠습니까?");
		System.out.println("1. 큐트(댄스조)\t\t2. 섹시(랩조)\t\t3. 청량(보컬조)");
		int concept=s.nextInt();
		System.out.println("당신은 어떤 능력치를 향상시키겠습니까?");
		System.out.println("1. 노래\t\t2. 춤\t\t3. 랩");
		answer=s.nextInt();
		if(answer==1) {
			System.out.println("당신은 노래를 선택했습니다.");
			System.out.println("남은 기간은 2주입니다.");
			System.out.println("당신은 며칠을 연습하겠습니까? 0~14 사이의 숫자를 입력하세요.");
			days=s.nextInt();
			System.out.println("당신은 "+days+"일 간 연습했습니다.");
			System.out.println("노래의 능력치가 "+days+"만큼 증가합니다.");
			ch.sing+=days;
			ch.physical+=days;
		}
		else if(answer==2) {
			System.out.println("당신은 춤을 선택했습니다.");
			System.out.println("남은 기간은 2주입니다.");
			System.out.println("당신은 며칠을 연습하겠습니까? 0~14 사이의 숫자를 입력하세요.");
			days=s.nextInt();
			System.out.println("당신은 "+days+"일 간 연습했습니다.");
			System.out.println("춤의 능력치가 "+days+"만큼 증가합니다.");
			ch.dance+=days;
			ch.physical+=days;
		}
		else if(answer==3) {
			System.out.println("당신은 랩을 선택했습니다.");
			System.out.println("남은 기간은 2주입니다.");
			System.out.println("당신은 며칠을 연습하겠습니까? 0~14 사이의 숫자를 입력하세요.");
			days=s.nextInt();
			System.out.println("당신은 "+days+"일 간 연습했습니다.");
			System.out.println("랩의 능력치가 "+days+"만큼 증가합니다.");
			ch.rap+=days;
			ch.physical+=days;
		}
		
		try {
		    Thread.sleep(1000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("-1차 평가전 당일-");
		System.out.println(ch.sing+"/"+ch.dance+"/"+ch.attractive+"/"+ch.physical+"/"+ch.fan);
		
		if(concept==1) {
			if(ch.dance>=20) {
				action.successPerformace();
			}
			else if(ch.dance<10){
				action.failPerformance();
			}
			else {
				System.out.println("무대를 마쳤습니다.");
			}
		}
		else if(concept==2) {
			if(ch.rap>=20) {
				action.successPerformace();
			}
			else if(ch.rap<10){
				action.failPerformance();
			}
			else {
				System.out.println("무대를 마쳤습니다.");
			}
		}
		else if(concept==3) {
			if(ch.sing>=20) {
				action.successPerformace();
			}
			else if(ch.sing<10){
				action.failPerformance();
			}
			else {
				System.out.println("무대를 마쳤습니다.");
			}
		}
		
		System.out.println();
		ch.info();
		
		try {
		    Thread.sleep(2000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		System.out.println();
		secondMatch();
	}
	
	void secondMatch() {
		int answer;
		int days;
		
		System.out.println("2차 평가전이 시작되었습니다.");
		System.out.println("무대 콘셉트는 큐트, 섹시, 청량입니다.");
		System.out.println("어떤 콘셉트로 무대를 진행하겠습니까?");
		System.out.println("1. 발랄한 큐트\t\t2. 묵직한 섹시\t\t3. 시원한 청량");
		int concept=s.nextInt();
		System.out.println("당신은 어떤 능력치를 향상시키겠습니까?");
		System.out.println("1. 노래\t\t2. 춤\t\t3. 랩");
		answer=s.nextInt();
		if(answer==1) {
			System.out.println("당신은 노래를 선택했습니다.");
			System.out.println("남은 기간은 열흘입니다.");
			System.out.println("당신은 며칠을 연습하겠습니까? 0~10 사이의 숫자를 입력하세요.");
			days=s.nextInt();
			if(days<=7) {
				action.fightMembers();
			}
			System.out.println("당신은 "+days+"일 간 연습합니다.");
			System.out.println("노래의 능력치가 "+days+"만큼 증가합니다.");
			ch.sing+=days;
			ch.physical+=days;
		}
		else if(answer==2) {
			System.out.println("당신은 춤을 선택했습니다.");
			System.out.println("남은 기간은 열흘입니다.");
			System.out.println("당신은 며칠을 연습하겠습니까? 0~10 사이의 숫자를 입력하세요.");
			days=s.nextInt();
			if(days<=7) {
				action.fightMembers();
			}
			System.out.println("당신은 "+days+"일 간 연습했습니다.");
			System.out.println("춤의 능력치가 "+days+"만큼 증가합니다.");
			ch.dance+=days;
			ch.physical+=days;
		}
		else if(answer==3) {
			System.out.println("당신은 랩을 선택했습니다.");
			System.out.println("남은 기간은 열흘입니다.");
			System.out.println("당신은 며칠을 연습하겠습니까? 0~10 사이의 숫자를 입력하세요.");
			days=s.nextInt();
			if(days<=7) {
				action.fightMembers();
			}
			System.out.println("당신은 "+days+"일 간 연습했습니다.");
			System.out.println("랩의 능력치가 "+days+"만큼 증가합니다.");
			ch.rap+=days;
			ch.physical+=days;
		}
		
		try {
		    Thread.sleep(1000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("-2차 평가전 당일-");
		System.out.println(ch.sing+"/"+ch.dance+"/"+ch.attractive+"/"+ch.physical+"/"+ch.fan);
		
		if(concept==1) {
			if(ch.dance>=30) {
				action.successPerformace();
			}
			else if(ch.dance<15){
				action.failPerformance();
			}
			else {
				System.out.println("무대를 마쳤습니다.");
			}
		}
		else if(concept==2) {
			if(ch.rap>=30) {
				action.successPerformace();
			}
			else if(ch.rap<15){
				action.failPerformance();
			}
			else {
				System.out.println("무대를 마쳤습니다.");
			}
		}
		else if(concept==3) {
			if(ch.sing>=30) {
				action.successPerformace();
			}
			else if(ch.sing<15){
				action.failPerformance();
			}
			else {
				System.out.println("무대를 마쳤습니다.");
			}
		}
		
		System.out.println();
		ch.info();
		
		try {
		    Thread.sleep(2000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		System.out.println();
		busking();
	}
	
	void busking() {
		int answer;
		int answer2;
		int days;
		
		System.out.println("파이널 무대 전 시민들과 직접적으로 소통할 수 있는 기회입니다.");
		System.out.println("이번 버스킹에서 시민들은 당신의 팬일수도, 아닐수도 있습니다.");
		System.out.println("따라서 이번 무대에서 당신이 실수를 저지른다면 야유가 발생합니다.");
		System.out.println("야유가 발생하면 당신의 모든 능력치가 감소하고 팬이 줄어듭니다.");
		System.out.println("당신은 어떤 무대를 보여주겠습니까?");
		System.out.println("1. 노래\t\t2. 춤\t\t3. 랩");
		answer=s.nextInt();

		System.out.println("당신에게는 5일의 시간이 주어졌습니다.");
		System.out.println("당신은 며칠을 연습하겠습니까? 0~5 사이의 숫자를 입력하세요.");
		days=s.nextInt();
		
		try {
		    Thread.sleep(100);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		int pdays=days-1;
		if(days<=1) {
			pdays=0;
		}
		
		System.out.println();
		if(ch.reputation<0) {
			System.out.println("당신이 연습하던 "+pdays+"일째, 무언가 소란스럽습니다.");
			System.out.println("제작진이 당신을 부릅니다.");
			System.out.println("\""+ch.name+", 앉으세요\"");
			System.out.println("자리에 앉은 당신의 앞으로 제작진이 핸드폰을 내밉니다.");
			System.out.println("당신은 핸드폰을 들어 동영상을 재생시킵니다.");
			System.out.println("2차 평가 때, 팀원에게 욕설을 뱉는 당신의 음성이 담겨 있습니다.");
			System.out.println("\"확인이 필요할 것 같아서 불렀어요. 어떻게 된 건지 들어볼 수 있을까요?\"");
			System.out.println("1. 횡설수설하다 당신의 잘못이 아니라고 우긴다.");
			System.out.println("2. 잘못을 시인하고 사죄한다.");
			answer2=s.nextInt();
			if(answer2==1) {
				System.out.println("당신은 사과문을 올릴 수 없습니다.");
				System.out.println("매력도 및 팬이 감소합니다.");
				ch.attractive-=20;
				ch.fan-=100;
			}
			if(answer==2) {
				System.out.println("당신은 사과문을 작성합니다.");
				System.out.println("매력도와 팬이 감소합니다. 하지만 힘내세요! 여전히 당신을 응원하는 팬들이 있습니다.");
				ch.attractive-=5;
				ch.fan-=30;
			}
		}
		
		try {
		    Thread.sleep(500);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("당신은 "+days+"일 간 연습합니다.");
		System.out.println("당신의 능력치가 "+days+"만큼 증가합니다.");
		ch.sing+=days;
		ch.dance+=days;
		ch.rap+=days;
		ch.physical+=days;
		
		try {
		    Thread.sleep(500);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("-버스킹 당일-");
		System.out.println(ch.sing+"/"+ch.dance+"/"+ch.attractive+"/"+ch.physical+"/"+ch.fan);
		
		if(ch.attractive>30) {
			action.successPerformace();
		}
		else if(ch.attractive>15) {
			System.out.println("무대를 마쳤습니다.");
		}
		else {
			action.failPerformance();
		}
		
		System.out.println();
		ch.info();
		
		try {
		    Thread.sleep(2000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		System.out.println();
		finalMatch();
		
	}
	
	void finalMatch() {
		int answer;
		int days;
		
		System.out.println("대망의 파이널 센터 선발전입니다.");
		System.out.println("이번 파이널 결과를 통해 당신은 데뷔를 할 수도, 못할 수도 있습니다.");
		System.out.println("끝까지 포기하지 말고 최선을 다해봅시다!\n");
		
		System.out.println("어떤 콘셉트로 무대를 진행하겠습니까?");
		System.out.println("1. 큐트\t\t2. 섹시\t\t3. 청량");
		int concept=s.nextInt();
		
		System.out.println("남은 기간은 보름입니다.");
		System.out.println("당신은 며칠을 연습하겠습니까? 0~15 사이의 숫자를 입력하세요.");
		days=s.nextInt();
		System.out.println("당신은 "+days+"일 간 연습합니다.");
		System.out.println("노래와 춤과 랩의 능력치가 "+days+"만큼 증가합니다. 체력도"+days+"만큼 증가합니다.");
		ch.sing+=days;
		ch.dance+=days;
		ch.rap+=days;
		ch.physical+=days;
		
		try {
		    Thread.sleep(1000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		System.out.println();
		System.out.println("-파이널 센터 선발전 당일-");
		System.out.println(ch.sing+"/"+ch.dance+"/"+ch.attractive+"/"+ch.physical+"/"+ch.fan);
		
		if(ch.fan>600) {
			action.successPerformace();
		}
		else if(ch.fan>400){
			System.out.println("무대를 마쳤습니다.");
		}
		else {
			action.failPerformance();
		}
		
		System.out.println();
		
		try {
		    Thread.sleep(2000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		System.out.println();
		debutNotDebut();
	}
	
	void debutNotDebut() {
		if((ch.rap>60 && ch.sing>60 && ch.dance>=100) || (ch.rap>60 && ch.sing>=100 && ch.dance>60) || (ch.rap>=100 && ch.sing>60 && ch.dance>60) && ch.fan>1000) {
			System.out.println("축하합니다! 당신은 1등으로 데뷔에 성공했습니다.");
			System.out.println("<칭호: 궁극의 아이돌>");
			ch.info();
		}
		else if((ch.rap>60 || ch.sing>60 || ch.dance>60) && ch.fan>1000) {
			System.out.println("축하합니다! 순위권 안에 들어 데뷔에 성공했습니다.");
			ch.info();
		}
		else {
			System.out.println("당신은 데뷔하지 못했습니다...");
			ch.info();
		}
	}
	
}
