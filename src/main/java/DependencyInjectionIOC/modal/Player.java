package DependencyInjectionIOC.modal;

public class Player {
	private String playerId;
	private String playerName;
	private Country country;
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String toString(){
		return "PlayerName : "+this.playerName+", PlayerId : "+this.playerId+", Country : "+this.country.toString();
	}
	
}
