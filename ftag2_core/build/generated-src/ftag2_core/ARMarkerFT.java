package ftag2_core;

public interface ARMarkerFT extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ftag2_core/ARMarkerFT";
  static final java.lang.String _DEFINITION = "Header header\nuint32 id\ngeometry_msgs/PoseWithCovariance pose\nuint32 confidence\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  int getId();
  void setId(int value);
  geometry_msgs.PoseWithCovariance getPose();
  void setPose(geometry_msgs.PoseWithCovariance value);
  int getConfidence();
  void setConfidence(int value);
}
