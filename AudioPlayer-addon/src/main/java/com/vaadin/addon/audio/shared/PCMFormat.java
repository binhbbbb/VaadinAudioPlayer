package com.vaadin.addon.audio.shared;

import java.io.Serializable;

/**
 * Format parameters for PCM data
 */
@SuppressWarnings("serial")
public class PCMFormat implements Serializable {

	private int numChannels;   // 1: mono, 2: stereo
	private int sampleRate;    // samples (values) per second of audio
	private int byteRate;      // sampleRate * numChannels * (bitsPerSample / 8)
	private int blockAlign;    // numChannels * (bitsPerSample / 8)
	private int bitsPerSample; // usually either 8 or 16

	public PCMFormat(int numChannels, int sampleRate, int bitsPerSample) {
		this.numChannels = numChannels;
		this.sampleRate = sampleRate;
		this.bitsPerSample = bitsPerSample;
		
		this.blockAlign = numChannels * (bitsPerSample / 8);
		this.byteRate = blockAlign * (bitsPerSample / 8);
	}
	
	public int getNumChannels() {
		return numChannels;
	}

	public int getSampleRate() {
		return sampleRate;
	}

	public int getByteRate() {
		return byteRate;
	}

	public int getBlockAlign() {
		return blockAlign;
	}

	public int getBitsPerSample() {
		return bitsPerSample;
	}

}

