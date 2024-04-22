package exc_testcode;
import java.util.Date;


public class Ticket {
	private Date date;
	
	private String movieTitle;
	
	private String seatNumber;
	
	private String theaterName;
	
	private String viewAge; //청소년, 성인 
	
	
	public Ticket(Date date, String movieTitle, String seatNumber, String theaterName, String viewAge)
	{
	       this.date = date;
	       this.movieTitle = movieTitle;
	       this.seatNumber = seatNumber;
	       this.theaterName = theaterName;
	       this.viewAge = viewAge;
	}
	
    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }
    
    // 영화 제목 설정 및 반환 메소드
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
    
    public String getMovieTitle() {
        return movieTitle;
    }
    
    // 좌석번호 설정 및 반환 메소드
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    
    public String getSeatNumber() {
        return seatNumber;
    }
    
    // 상영관 설정 및 반환 메소드
    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }
    
    public String getTheaterName() {
        return theaterName;
    }
    
    // 관람자 설정 및 반환 메소드
    public void setViewerName(String viewAge) {
        this.viewAge = viewAge;
    }
    
    public String getViewerName() {
        return viewAge;
    }
    
}
