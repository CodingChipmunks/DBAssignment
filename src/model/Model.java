package model;

import java.util.ArrayList;

/**
 * Keeps temporary track of components in the model
 */
 public class Model {
	private ArrayList<Album> album;
	private ArrayList<Movie> movie;
	private ArrayList<Review> review;
	private Object[] bank = null; // contains the result of last query.
	private String user = "";
	private String pass = "";
	private boolean validatedAccount = false;

	public Model(String user, String pass)
	{
		this.user = user;
		this.pass = pass;
	}
	
	public void setUser(String user)
	{
		this.user = user;
	}
	
	public String getUser()
	{
		return this.user;
	}
	
	public void setPass(String pass)
	{
		this.pass = pass;
	}
	
	public String getPass()
	{
		return this.pass;
	}
	
	public void setBank(Object[] bank)
	{
		this.bank = bank;
	}
	
	public Object[] getBank()
	{
		return bank;
	}
	
	public void clear() {
		album.clear();
		movie.clear();
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Album> getAlbum() {
		return (ArrayList<Album>) album.clone();
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Review> getReview()
	{
		return ((ArrayList<Review>) review.clone());
	}
	
	
	@SuppressWarnings("unchecked")
	public ArrayList<Movie> getMovie() {
		return (ArrayList<Movie>) movie.clone();
	}

	public int getMovieCount()
	{
		return movie.size();
	}
	
	public int getAlbumCount()
	{
		return album.size();
	}
	
	public Movie getMovie(int index) {
		return movie.get(index);
	}

	public Album getAlbum(int index) {
		return album.get(index);
	}
	
	// called from QueryExecuter.loginValidate(...);
	public void setValidAccount(boolean is)
	{
		validatedAccount = is;
	}
	
	// called from main thread post-query.
	public boolean getValidAccount() {
		return validatedAccount;
	}
}
