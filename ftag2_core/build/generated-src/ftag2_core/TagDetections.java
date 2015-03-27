package ftag2_core;

public interface TagDetections extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ftag2_core/TagDetections";
  static final java.lang.String _DEFINITION = "int32 frameID\n\nTagDetection[] tags\n";
  int getFrameID();
  void setFrameID(int value);
  java.util.List<ftag2_core.TagDetection> getTags();
  void setTags(java.util.List<ftag2_core.TagDetection> value);
}
