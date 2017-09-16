/*
 * Copyright 2017 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.visual_recognition.v3.model;

import java.util.Date;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * An image contained within an image collection.
 */
public class CollectionImage extends GenericModel {

  @SerializedName("image_id")
  private String imageId;
  private Date created;
  @SerializedName("image_file")
  private String imageFile;
  private Map metadata;
  private Double score;

  /**
   * Gets the imageId.
   *
   * The unique ID of the image. Save this to add or remove it from the collection.
   *
   * @return the imageId
   */
  public String getImageId() {
    return imageId;
  }

  /**
   * Gets the created.
   *
   * Date the image was added to the collection.
   *
   * @return the created
   */
  public Date getCreated() {
    return created;
  }

  /**
   * Gets the imageFile.
   *
   * File name of the image.
   *
   * @return the imageFile
   */
  public String getImageFile() {
    return imageFile;
  }

  /**
   * Gets the metadata.
   *
   * Any metadata associated with the image.
   *
   * @return the metadata
   */
  public Map getMetadata() {
    return metadata;
  }

  /**
   * Gets the score.
   *
   * The confidence level of the match with similar images. Provided only when searching for similar images.
   *
   * @return the score
   */
  public Double getScore() {
    return score;
  }

  /**
   * Sets the imageId.
   *
   * @param imageId the new imageId
   */
  public void setImageId(final String imageId) {
    this.imageId = imageId;
  }

  /**
   * Sets the created.
   *
   * @param created the new created
   */
  public void setCreated(final Date created) {
    this.created = created;
  }

  /**
   * Sets the imageFile.
   *
   * @param imageFile the new imageFile
   */
  public void setImageFile(final String imageFile) {
    this.imageFile = imageFile;
  }

  /**
   * Sets the metadata.
   *
   * @param metadata the new metadata
   */
  public void setMetadata(final Map metadata) {
    this.metadata = metadata;
  }

  /**
   * Sets the score.
   *
   * @param score the new score
   */
  public void setScore(final Double score) {
    this.score = score;
  }
}
