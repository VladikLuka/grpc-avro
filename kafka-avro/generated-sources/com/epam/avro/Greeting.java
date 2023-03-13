/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.epam.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Greeting extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3967494671210308464L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Greeting\",\"namespace\":\"com.epam.avro\",\"fields\":[{\"name\":\"greet\",\"type\":\"string\"},{\"name\":\"time\",\"type\":[\"long\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Greeting> ENCODER =
      new BinaryMessageEncoder<Greeting>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Greeting> DECODER =
      new BinaryMessageDecoder<Greeting>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Greeting> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Greeting> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Greeting> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Greeting>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Greeting to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Greeting from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Greeting instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Greeting fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence greet;
   private java.lang.Long time;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Greeting() {}

  /**
   * All-args constructor.
   * @param greet The new value for greet
   * @param time The new value for time
   */
  public Greeting(java.lang.CharSequence greet, java.lang.Long time) {
    this.greet = greet;
    this.time = time;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return greet;
    case 1: return time;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: greet = (java.lang.CharSequence)value$; break;
    case 1: time = (java.lang.Long)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'greet' field.
   * @return The value of the 'greet' field.
   */
  public java.lang.CharSequence getGreet() {
    return greet;
  }


  /**
   * Sets the value of the 'greet' field.
   * @param value the value to set.
   */
  public void setGreet(java.lang.CharSequence value) {
    this.greet = value;
  }

  /**
   * Gets the value of the 'time' field.
   * @return The value of the 'time' field.
   */
  public java.lang.Long getTime() {
    return time;
  }


  /**
   * Sets the value of the 'time' field.
   * @param value the value to set.
   */
  public void setTime(java.lang.Long value) {
    this.time = value;
  }

  /**
   * Creates a new Greeting RecordBuilder.
   * @return A new Greeting RecordBuilder
   */
  public static com.epam.avro.Greeting.Builder newBuilder() {
    return new com.epam.avro.Greeting.Builder();
  }

  /**
   * Creates a new Greeting RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Greeting RecordBuilder
   */
  public static com.epam.avro.Greeting.Builder newBuilder(com.epam.avro.Greeting.Builder other) {
    if (other == null) {
      return new com.epam.avro.Greeting.Builder();
    } else {
      return new com.epam.avro.Greeting.Builder(other);
    }
  }

  /**
   * Creates a new Greeting RecordBuilder by copying an existing Greeting instance.
   * @param other The existing instance to copy.
   * @return A new Greeting RecordBuilder
   */
  public static com.epam.avro.Greeting.Builder newBuilder(com.epam.avro.Greeting other) {
    if (other == null) {
      return new com.epam.avro.Greeting.Builder();
    } else {
      return new com.epam.avro.Greeting.Builder(other);
    }
  }

  /**
   * RecordBuilder for Greeting instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Greeting>
    implements org.apache.avro.data.RecordBuilder<Greeting> {

    private java.lang.CharSequence greet;
    private java.lang.Long time;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.epam.avro.Greeting.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.greet)) {
        this.greet = data().deepCopy(fields()[0].schema(), other.greet);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.time)) {
        this.time = data().deepCopy(fields()[1].schema(), other.time);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing Greeting instance
     * @param other The existing instance to copy.
     */
    private Builder(com.epam.avro.Greeting other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.greet)) {
        this.greet = data().deepCopy(fields()[0].schema(), other.greet);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.time)) {
        this.time = data().deepCopy(fields()[1].schema(), other.time);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'greet' field.
      * @return The value.
      */
    public java.lang.CharSequence getGreet() {
      return greet;
    }


    /**
      * Sets the value of the 'greet' field.
      * @param value The value of 'greet'.
      * @return This builder.
      */
    public com.epam.avro.Greeting.Builder setGreet(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.greet = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'greet' field has been set.
      * @return True if the 'greet' field has been set, false otherwise.
      */
    public boolean hasGreet() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'greet' field.
      * @return This builder.
      */
    public com.epam.avro.Greeting.Builder clearGreet() {
      greet = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'time' field.
      * @return The value.
      */
    public java.lang.Long getTime() {
      return time;
    }


    /**
      * Sets the value of the 'time' field.
      * @param value The value of 'time'.
      * @return This builder.
      */
    public com.epam.avro.Greeting.Builder setTime(java.lang.Long value) {
      validate(fields()[1], value);
      this.time = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'time' field has been set.
      * @return True if the 'time' field has been set, false otherwise.
      */
    public boolean hasTime() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'time' field.
      * @return This builder.
      */
    public com.epam.avro.Greeting.Builder clearTime() {
      time = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Greeting build() {
      try {
        Greeting record = new Greeting();
        record.greet = fieldSetFlags()[0] ? this.greet : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.time = fieldSetFlags()[1] ? this.time : (java.lang.Long) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Greeting>
    WRITER$ = (org.apache.avro.io.DatumWriter<Greeting>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Greeting>
    READER$ = (org.apache.avro.io.DatumReader<Greeting>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.greet);

    if (this.time == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeLong(this.time);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.greet = in.readString(this.greet instanceof Utf8 ? (Utf8)this.greet : null);

      if (in.readIndex() != 0) {
        in.readNull();
        this.time = null;
      } else {
        this.time = in.readLong();
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.greet = in.readString(this.greet instanceof Utf8 ? (Utf8)this.greet : null);
          break;

        case 1:
          if (in.readIndex() != 0) {
            in.readNull();
            this.time = null;
          } else {
            this.time = in.readLong();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










