// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: prediction_service.proto

package tensorflow.serving;

public final class PredictionServiceOuterClass {
  private PredictionServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\030prediction_service.proto\022\022tensorflow.s" +
      "erving\032\024classification.proto\032\030get_model_" +
      "metadata.proto\032\017inference.proto\032\rpredict" +
      ".proto\032\020regression.proto2\374\003\n\021PredictionS" +
      "ervice\022a\n\010Classify\022).tensorflow.serving." +
      "ClassificationRequest\032*.tensorflow.servi" +
      "ng.ClassificationResponse\022X\n\007Regress\022%.t" +
      "ensorflow.serving.RegressionRequest\032&.te" +
      "nsorflow.serving.RegressionResponse\022R\n\007P" +
      "redict\022\".tensorflow.serving.PredictReque" +
      "st\032#.tensorflow.serving.PredictResponse\022" +
      "g\n\016MultiInference\022).tensorflow.serving.M" +
      "ultiInferenceRequest\032*.tensorflow.servin" +
      "g.MultiInferenceResponse\022m\n\020GetModelMeta" +
      "data\022+.tensorflow.serving.GetModelMetada" +
      "taRequest\032,.tensorflow.serving.GetModelM" +
      "etadataResponseB\003\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          Classification.getDescriptor(),
          GetModelMetadata.getDescriptor(),
          Inference.getDescriptor(),
          Predict.getDescriptor(),
          RegressionOuterClass.getDescriptor(),
        });
    Classification.getDescriptor();
    GetModelMetadata.getDescriptor();
    Inference.getDescriptor();
    Predict.getDescriptor();
    RegressionOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
