// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pollutiontracking.proto

package grpc.distributedca;

public final class SmartPollutionTrackingSystemImpl {
  private SmartPollutionTrackingSystemImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartpollutiontracker_WaterPollutionHistoryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartpollutiontracker_WaterPollutionHistoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartpollutiontracker_WaterPollutionAlertsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartpollutiontracker_WaterPollutionAlertsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartpollutiontracker_WaterPollutionAlertsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartpollutiontracker_WaterPollutionAlertsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartpollutiontracker_WaterPollutionAlert_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartpollutiontracker_WaterPollutionAlert_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartpollutiontracker_WaterPollutionMonitorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartpollutiontracker_WaterPollutionMonitorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartpollutiontracker_WaterPollutionLevel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartpollutiontracker_WaterPollutionLevel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartpollutiontracker_AirPollutionHistoryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartpollutiontracker_AirPollutionHistoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartpollutiontracker_AirPollutionAlertsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartpollutiontracker_AirPollutionAlertsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartpollutiontracker_AirPollutionAlertsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartpollutiontracker_AirPollutionAlertsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartpollutiontracker_AirPollutionAlert_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartpollutiontracker_AirPollutionAlert_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartpollutiontracker_AirPollutionMonitorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartpollutiontracker_AirPollutionMonitorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartpollutiontracker_AirPollutionLevel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartpollutiontracker_AirPollutionLevel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartpollutiontracker_PollutionStatisticsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartpollutiontracker_PollutionStatisticsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartpollutiontracker_PollutionStatistics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartpollutiontracker_PollutionStatistics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartpollutiontracker_LocationFilterRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartpollutiontracker_LocationFilterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartpollutiontracker_FavoriteLocationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartpollutiontracker_FavoriteLocationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartpollutiontracker_FavoriteLocationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartpollutiontracker_FavoriteLocationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_smartpollutiontracker_PollutionLevel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_smartpollutiontracker_PollutionLevel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027pollutiontracking.proto\022\025smartpollutio" +
      "ntracker\"V\n\034WaterPollutionHistoryRequest" +
      "\022\022\n\nstart_time\030\001 \001(\003\022\020\n\010end_time\030\002 \001(\003\022\020" +
      "\n\010location\030\003 \001(\t\"B\n\033WaterPollutionAlerts" +
      "Request\022\021\n\tthreshold\030\001 \001(\005\022\020\n\010location\030\002" +
      " \001(\t\"Z\n\034WaterPollutionAlertsResponse\022:\n\006" +
      "alerts\030\001 \003(\0132*.smartpollutiontracker.Wat" +
      "erPollutionAlert\"k\n\023WaterPollutionAlert\022" +
      "\020\n\010location\030\001 \001(\t\022\026\n\016pollution_type\030\002 \001(" +
      "\t\022\027\n\017pollution_level\030\003 \001(\002\022\021\n\ttimestamp\030" +
      "\004 \001(\t\"0\n\034WaterPollutionMonitorRequest\022\020\n" +
      "\010location\030\001 \001(\t\"k\n\023WaterPollutionLevel\022\020" +
      "\n\010location\030\001 \001(\t\022\026\n\016pollution_type\030\002 \001(\t" +
      "\022\027\n\017pollution_level\030\003 \001(\002\022\021\n\ttimestamp\030\004" +
      " \001(\t\"T\n\032AirPollutionHistoryRequest\022\022\n\nst" +
      "art_time\030\001 \001(\003\022\020\n\010end_time\030\002 \001(\003\022\020\n\010loca" +
      "tion\030\003 \001(\t\"@\n\031AirPollutionAlertsRequest\022" +
      "\021\n\tthreshold\030\001 \001(\005\022\020\n\010location\030\002 \001(\t\"V\n\032" +
      "AirPollutionAlertsResponse\0228\n\006alerts\030\001 \003" +
      "(\0132(.smartpollutiontracker.AirPollutionA" +
      "lert\"i\n\021AirPollutionAlert\022\020\n\010location\030\001 " +
      "\001(\t\022\026\n\016pollution_type\030\002 \001(\t\022\027\n\017pollution" +
      "_level\030\003 \001(\002\022\021\n\ttimestamp\030\004 \001(\t\".\n\032AirPo" +
      "llutionMonitorRequest\022\020\n\010location\030\001 \001(\t\"" +
      "i\n\021AirPollutionLevel\022\020\n\010location\030\001 \001(\t\022\026" +
      "\n\016pollution_type\030\002 \001(\t\022\027\n\017pollution_leve" +
      "l\030\003 \001(\002\022\021\n\ttimestamp\030\004 \001(\t\".\n\032PollutionS" +
      "tatisticsRequest\022\020\n\010location\030\001 \001(\t\"<\n\023Po" +
      "llutionStatistics\022\026\n\016statistic_type\030\001 \001(" +
      "\t\022\r\n\005value\030\002 \001(\002\")\n\025LocationFilterReques" +
      "t\022\020\n\010location\030\001 \001(\t\"+\n\027FavoriteLocationR" +
      "equest\022\020\n\010location\030\001 \001(\t\"+\n\030FavoriteLoca" +
      "tionResponse\022\017\n\007message\030\001 \001(\t\"-\n\016Polluti" +
      "onLevel\022\r\n\005value\030\001 \001(\002\022\014\n\004unit\030\002 \001(\t2\237\003\n" +
      "\025WaterPollutionTracker\022\177\n\030GetWaterPollut" +
      "ionHistory\0223.smartpollutiontracker.Water" +
      "PollutionHistoryRequest\032*.smartpollution" +
      "tracker.WaterPollutionLevel\"\0000\001\022\204\001\n\027GetW" +
      "aterPollutionAlerts\0222.smartpollutiontrac" +
      "ker.WaterPollutionAlertsRequest\0323.smartp" +
      "ollutiontracker.WaterPollutionAlertsResp" +
      "onse\"\000\022~\n\025MonitorWaterPollution\0223.smartp" +
      "ollutiontracker.WaterPollutionMonitorReq" +
      "uest\032*.smartpollutiontracker.WaterPollut" +
      "ionLevel\"\000(\0010\0012\212\003\n\023AirPollutionTracker\022y" +
      "\n\026GetAirPollutionHistory\0221.smartpollutio" +
      "ntracker.AirPollutionHistoryRequest\032(.sm" +
      "artpollutiontracker.AirPollutionLevel\"\0000" +
      "\001\022~\n\025GetAirPollutionAlerts\0220.smartpollut" +
      "iontracker.AirPollutionAlertsRequest\0321.s" +
      "martpollutiontracker.AirPollutionAlertsR" +
      "esponse\"\000\022x\n\023MonitorAirPollution\0221.smart" +
      "pollutiontracker.AirPollutionMonitorRequ" +
      "est\032(.smartpollutiontracker.AirPollution" +
      "Level\"\000(\0010\0012\201\003\n\021DataVisualization\022{\n\026Get" +
      "PollutionStatistics\0221.smartpollutiontrac" +
      "ker.PollutionStatisticsRequest\032*.smartpo" +
      "llutiontracker.PollutionStatistics\"\0000\001\022q" +
      "\n\024FilterDataByLocation\022,.smartpollutiont" +
      "racker.LocationFilterRequest\032%.smartpoll" +
      "utiontracker.PollutionLevel\"\000(\0010\001\022|\n\023Set" +
      "FavoriteLocation\022..smartpollutiontracker" +
      ".FavoriteLocationRequest\032/.smartpollutio" +
      "ntracker.FavoriteLocationResponse\"\000(\0010\001B" +
      "8\n\022grpc.distributedcaB SmartPollutionTra" +
      "ckingSystemImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_smartpollutiontracker_WaterPollutionHistoryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_smartpollutiontracker_WaterPollutionHistoryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartpollutiontracker_WaterPollutionHistoryRequest_descriptor,
        new java.lang.String[] { "StartTime", "EndTime", "Location", });
    internal_static_smartpollutiontracker_WaterPollutionAlertsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_smartpollutiontracker_WaterPollutionAlertsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartpollutiontracker_WaterPollutionAlertsRequest_descriptor,
        new java.lang.String[] { "Threshold", "Location", });
    internal_static_smartpollutiontracker_WaterPollutionAlertsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_smartpollutiontracker_WaterPollutionAlertsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartpollutiontracker_WaterPollutionAlertsResponse_descriptor,
        new java.lang.String[] { "Alerts", });
    internal_static_smartpollutiontracker_WaterPollutionAlert_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_smartpollutiontracker_WaterPollutionAlert_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartpollutiontracker_WaterPollutionAlert_descriptor,
        new java.lang.String[] { "Location", "PollutionType", "PollutionLevel", "Timestamp", });
    internal_static_smartpollutiontracker_WaterPollutionMonitorRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_smartpollutiontracker_WaterPollutionMonitorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartpollutiontracker_WaterPollutionMonitorRequest_descriptor,
        new java.lang.String[] { "Location", });
    internal_static_smartpollutiontracker_WaterPollutionLevel_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_smartpollutiontracker_WaterPollutionLevel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartpollutiontracker_WaterPollutionLevel_descriptor,
        new java.lang.String[] { "Location", "PollutionType", "PollutionLevel", "Timestamp", });
    internal_static_smartpollutiontracker_AirPollutionHistoryRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_smartpollutiontracker_AirPollutionHistoryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartpollutiontracker_AirPollutionHistoryRequest_descriptor,
        new java.lang.String[] { "StartTime", "EndTime", "Location", });
    internal_static_smartpollutiontracker_AirPollutionAlertsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_smartpollutiontracker_AirPollutionAlertsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartpollutiontracker_AirPollutionAlertsRequest_descriptor,
        new java.lang.String[] { "Threshold", "Location", });
    internal_static_smartpollutiontracker_AirPollutionAlertsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_smartpollutiontracker_AirPollutionAlertsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartpollutiontracker_AirPollutionAlertsResponse_descriptor,
        new java.lang.String[] { "Alerts", });
    internal_static_smartpollutiontracker_AirPollutionAlert_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_smartpollutiontracker_AirPollutionAlert_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartpollutiontracker_AirPollutionAlert_descriptor,
        new java.lang.String[] { "Location", "PollutionType", "PollutionLevel", "Timestamp", });
    internal_static_smartpollutiontracker_AirPollutionMonitorRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_smartpollutiontracker_AirPollutionMonitorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartpollutiontracker_AirPollutionMonitorRequest_descriptor,
        new java.lang.String[] { "Location", });
    internal_static_smartpollutiontracker_AirPollutionLevel_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_smartpollutiontracker_AirPollutionLevel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartpollutiontracker_AirPollutionLevel_descriptor,
        new java.lang.String[] { "Location", "PollutionType", "PollutionLevel", "Timestamp", });
    internal_static_smartpollutiontracker_PollutionStatisticsRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_smartpollutiontracker_PollutionStatisticsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartpollutiontracker_PollutionStatisticsRequest_descriptor,
        new java.lang.String[] { "Location", });
    internal_static_smartpollutiontracker_PollutionStatistics_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_smartpollutiontracker_PollutionStatistics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartpollutiontracker_PollutionStatistics_descriptor,
        new java.lang.String[] { "StatisticType", "Value", });
    internal_static_smartpollutiontracker_LocationFilterRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_smartpollutiontracker_LocationFilterRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartpollutiontracker_LocationFilterRequest_descriptor,
        new java.lang.String[] { "Location", });
    internal_static_smartpollutiontracker_FavoriteLocationRequest_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_smartpollutiontracker_FavoriteLocationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartpollutiontracker_FavoriteLocationRequest_descriptor,
        new java.lang.String[] { "Location", });
    internal_static_smartpollutiontracker_FavoriteLocationResponse_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_smartpollutiontracker_FavoriteLocationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartpollutiontracker_FavoriteLocationResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_smartpollutiontracker_PollutionLevel_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_smartpollutiontracker_PollutionLevel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_smartpollutiontracker_PollutionLevel_descriptor,
        new java.lang.String[] { "Value", "Unit", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
