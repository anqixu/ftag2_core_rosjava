package ftag2_core;

public interface TagDetection extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ftag2_core/TagDetection";
  static final java.lang.String _DEFINITION = "geometry_msgs/Pose pose\n\nfloat64 markerPixelWidth\n\nstring IDString\n\n# Debug\nfloat64[] mags\nfloat64[] phases\nfloat64[] phaseVariances\n\nstring bitChunksStr\nstring decodedPayloadStr";
  geometry_msgs.Pose getPose();
  void setPose(geometry_msgs.Pose value);
  double getMarkerPixelWidth();
  void setMarkerPixelWidth(double value);
  java.lang.String getIDString();
  void setIDString(java.lang.String value);
  double[] getMags();
  void setMags(double[] value);
  double[] getPhases();
  void setPhases(double[] value);
  double[] getPhaseVariances();
  void setPhaseVariances(double[] value);
  java.lang.String getBitChunksStr();
  void setBitChunksStr(java.lang.String value);
  java.lang.String getDecodedPayloadStr();
  void setDecodedPayloadStr(java.lang.String value);
}
