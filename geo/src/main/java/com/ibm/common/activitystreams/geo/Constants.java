package com.ibm.common.activitystreams.geo;

public interface Constants {

  public static final String GEO = "http://www.w3.org/2003/01/geo/wgs84_pos#";
  public static final String GS = "http://www.opengis.net/ont/geosparql#";
  
  public static final String GEO_TYPE_POINT = GEO + "Point";
  public static final String GEO_LAT = GEO + "lat";
  public static final String GEO_LONG = GEO + "long";
  public static final String GEO_ALT = GEO + "alt";
  
  public static final String GS_TYPE_GEOMETRY = GS + "Geometry";
  public static final String GS_ASWKT = GS + "asWKT";
  public static final String GS_WKTLITERAL = GS + "wktLiteral";
}
