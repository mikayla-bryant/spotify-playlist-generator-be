package com.mbryant.spotifyplaylistgenerator;

public class Constants
{
    public final static String CLIENT_ID = System.getenv("SPOTIFY_CLIENT_ID");
    public final static String CLIENT_SECRET = System.getenv("SPOTIFY_CLIENT_SECRET");

    public static final String AUTHORIZE = "/authorize";
    public static final String REDIRECT = "/spotify-redirect";
    public static final String TOKEN = "/token";
    public static final String ME = "/me";
}