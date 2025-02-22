package particeTestng;

import org.testng.annotations.Test;

public class TrelloActivity {

	@Test
	public void createTrelloBoard() {
		System.out.println("createTrelloBoard");
	}

	@Test
	public void deleteTrelloBoard() {
		System.out.println("deleteTrelloBoard");
	}

	@Test
	public void createListInBoard() {
		System.out.println("createListInBoard");
	}

	@Test
	public void createCardInList() {
		System.out.println("createCardInList");
	}

	@Test
	public void setTargetDateToCard() {
		System.out.println("setTargetDateToCard");
	}

	@Test
	public void DragAndDropCard() {
		System.out.println("DragAndDropCard");
	}

}
