/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Message;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class EventMessage extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3203406595306534904L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EventMessage\",\"namespace\":\"Message\",\"fields\":[{\"name\":\"machine\",\"type\":\"string\"},{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"date\",\"type\":\"long\"},{\"name\":\"status\",\"type\":\"float\"},{\"name\":\"building\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<EventMessage> ENCODER =
      new BinaryMessageEncoder<EventMessage>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<EventMessage> DECODER =
      new BinaryMessageDecoder<EventMessage>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<EventMessage> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<EventMessage> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<EventMessage>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this EventMessage to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a EventMessage from a ByteBuffer. */
  public static EventMessage fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence machine;
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public long date;
  @Deprecated public float status;
  @Deprecated public java.lang.CharSequence building;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EventMessage() {}

  /**
   * All-args constructor.
   * @param machine The new value for machine
   * @param id The new value for id
   * @param date The new value for date
   * @param status The new value for status
   * @param building The new value for building
   */
  public EventMessage(java.lang.CharSequence machine, java.lang.CharSequence id, java.lang.Long date, java.lang.Float status, java.lang.CharSequence building) {
    this.machine = machine;
    this.id = id;
    this.date = date;
    this.status = status;
    this.building = building;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return machine;
    case 1: return id;
    case 2: return date;
    case 3: return status;
    case 4: return building;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: machine = (java.lang.CharSequence)value$; break;
    case 1: id = (java.lang.CharSequence)value$; break;
    case 2: date = (java.lang.Long)value$; break;
    case 3: status = (java.lang.Float)value$; break;
    case 4: building = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'machine' field.
   * @return The value of the 'machine' field.
   */
  public java.lang.CharSequence getMachine() {
    return machine;
  }

  /**
   * Sets the value of the 'machine' field.
   * @param value the value to set.
   */
  public void setMachine(java.lang.CharSequence value) {
    this.machine = value;
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'date' field.
   * @return The value of the 'date' field.
   */
  public java.lang.Long getDate() {
    return date;
  }

  /**
   * Sets the value of the 'date' field.
   * @param value the value to set.
   */
  public void setDate(java.lang.Long value) {
    this.date = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.Float getStatus() {
    return status;
  }

  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.Float value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'building' field.
   * @return The value of the 'building' field.
   */
  public java.lang.CharSequence getBuilding() {
    return building;
  }

  /**
   * Sets the value of the 'building' field.
   * @param value the value to set.
   */
  public void setBuilding(java.lang.CharSequence value) {
    this.building = value;
  }

  /**
   * Creates a new EventMessage RecordBuilder.
   * @return A new EventMessage RecordBuilder
   */
  public static Message.EventMessage.Builder newBuilder() {
    return new Message.EventMessage.Builder();
  }

  /**
   * Creates a new EventMessage RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EventMessage RecordBuilder
   */
  public static Message.EventMessage.Builder newBuilder(Message.EventMessage.Builder other) {
    return new Message.EventMessage.Builder(other);
  }

  /**
   * Creates a new EventMessage RecordBuilder by copying an existing EventMessage instance.
   * @param other The existing instance to copy.
   * @return A new EventMessage RecordBuilder
   */
  public static Message.EventMessage.Builder newBuilder(Message.EventMessage other) {
    return new Message.EventMessage.Builder(other);
  }

  /**
   * RecordBuilder for EventMessage instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EventMessage>
    implements org.apache.avro.data.RecordBuilder<EventMessage> {

    private java.lang.CharSequence machine;
    private java.lang.CharSequence id;
    private long date;
    private float status;
    private java.lang.CharSequence building;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Message.EventMessage.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.machine)) {
        this.machine = data().deepCopy(fields()[0].schema(), other.machine);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.date)) {
        this.date = data().deepCopy(fields()[2].schema(), other.date);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.status)) {
        this.status = data().deepCopy(fields()[3].schema(), other.status);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.building)) {
        this.building = data().deepCopy(fields()[4].schema(), other.building);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing EventMessage instance
     * @param other The existing instance to copy.
     */
    private Builder(Message.EventMessage other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.machine)) {
        this.machine = data().deepCopy(fields()[0].schema(), other.machine);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.date)) {
        this.date = data().deepCopy(fields()[2].schema(), other.date);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.status)) {
        this.status = data().deepCopy(fields()[3].schema(), other.status);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.building)) {
        this.building = data().deepCopy(fields()[4].schema(), other.building);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'machine' field.
      * @return The value.
      */
    public java.lang.CharSequence getMachine() {
      return machine;
    }

    /**
      * Sets the value of the 'machine' field.
      * @param value The value of 'machine'.
      * @return This builder.
      */
    public Message.EventMessage.Builder setMachine(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.machine = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'machine' field has been set.
      * @return True if the 'machine' field has been set, false otherwise.
      */
    public boolean hasMachine() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'machine' field.
      * @return This builder.
      */
    public Message.EventMessage.Builder clearMachine() {
      machine = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public Message.EventMessage.Builder setId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public Message.EventMessage.Builder clearId() {
      id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'date' field.
      * @return The value.
      */
    public java.lang.Long getDate() {
      return date;
    }

    /**
      * Sets the value of the 'date' field.
      * @param value The value of 'date'.
      * @return This builder.
      */
    public Message.EventMessage.Builder setDate(long value) {
      validate(fields()[2], value);
      this.date = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'date' field has been set.
      * @return True if the 'date' field has been set, false otherwise.
      */
    public boolean hasDate() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'date' field.
      * @return This builder.
      */
    public Message.EventMessage.Builder clearDate() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.Float getStatus() {
      return status;
    }

    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public Message.EventMessage.Builder setStatus(float value) {
      validate(fields()[3], value);
      this.status = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public Message.EventMessage.Builder clearStatus() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'building' field.
      * @return The value.
      */
    public java.lang.CharSequence getBuilding() {
      return building;
    }

    /**
      * Sets the value of the 'building' field.
      * @param value The value of 'building'.
      * @return This builder.
      */
    public Message.EventMessage.Builder setBuilding(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.building = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'building' field has been set.
      * @return True if the 'building' field has been set, false otherwise.
      */
    public boolean hasBuilding() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'building' field.
      * @return This builder.
      */
    public Message.EventMessage.Builder clearBuilding() {
      building = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public EventMessage build() {
      try {
        EventMessage record = new EventMessage();
        record.machine = fieldSetFlags()[0] ? this.machine : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.date = fieldSetFlags()[2] ? this.date : (java.lang.Long) defaultValue(fields()[2]);
        record.status = fieldSetFlags()[3] ? this.status : (java.lang.Float) defaultValue(fields()[3]);
        record.building = fieldSetFlags()[4] ? this.building : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<EventMessage>
    WRITER$ = (org.apache.avro.io.DatumWriter<EventMessage>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<EventMessage>
    READER$ = (org.apache.avro.io.DatumReader<EventMessage>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
