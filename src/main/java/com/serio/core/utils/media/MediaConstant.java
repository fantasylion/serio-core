package com.serio.core.utils.media;

/**
 * @author zl.shi
 */
public class MediaConstant {
	
	/**
	 * <p>When used as an input option (before -i), seeks in this input file to position. Note that in most formats it is not possible to seek exactly, so ffmpeg will seek to the closest seek point before position. When transcoding and -accurate_seek is enabled (the default), this extra segment between the seek point and position will be decoded and discarded.
	 *  When doing stream copy or when -noaccurate_seek is used, it will be preserved.</p>
	 * <p>When used as an output option (before an output url), decodes but discards input until the timestamps reach position.</p>
	 * <p>position must be a time duration specification, see (ffmpeg-utils)the Time duration section in the ffmpeg-utils(1) manual.</p>
	 */
	public static String PARAMETER_NAME_SECONDS = "-ss";
	
	/**
	 * input file url
	 */
	public static String PARAMETER_NAME_SOURCE = "-i";
	
	/**
	 * <p>Force input or output file format. The format is normally auto detected for input files and guessed from the file extension for output files,
	 *  so this option is not needed in most cases.</p>
	 */
	public static String PARAMETER_NAME_FMT = "-f";
	
	/**
	 * <p>Set frame size.</p>
	 * <p>As an input option, this is a shortcut for the video_size private option, 
	 * recognized by some demuxers for which the frame size is either not stored in the file or is configurable – e.g. raw video or video grabbers.</p>
	 * <p>As an output option, this inserts the scale video filter to the end of the corresponding filtergraph.
	 * Please use the scale filter directly to insert it at the beginning or some other place.</p>
	 * <p>The format is ‘wxh’ (default - same as source).</p>
	 */
	public static String PARAMETER_NAME_SIZE = "-s";
	
	/**
	 * <p>Overwrite output files without asking.</p>
	 */
	public static String PARAMETER_NAME_DESTINATION = "-y";
	

}