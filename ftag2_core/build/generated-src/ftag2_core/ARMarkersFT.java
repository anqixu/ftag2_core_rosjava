package ftag2_core;

public interface ARMarkersFT extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ftag2_core/ARMarkersFT";
  static final java.lang.String _DEFINITION = "Header header\nARMarkerFT[] markers\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<ftag2_core.ARMarkerFT> getMarkers();
  void setMarkers(java.util.List<ftag2_core.ARMarkerFT> value);
}
