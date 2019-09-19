package pages;

/**
 * The enum Sort values.
 */
public enum SortValues {

    /**
     * None sort values.
     */
    EMPTY("--"),
    /**
     * Best match sort values.
     */
    PRODUCT_A("Product Name: A to Z"),
    /**
     * Best sellers sort values.
     */
    PRODUCT_Z("Product Name: Z to A"),
    /**
     * Price low sort values.
     */
    PRICE_LOW("Price: Lowest first"),
    /**
     * Price high sort values.
     */
    PRICE_HIGH("Price: Highest first"),
    /**
     * STOCK sort values.
     */
    STOCK("In stock"),

    /**
     * REFERENCE_LOW sort values.
     */
    REFERENCE_LOW("Reference: Lowest first"),

    /**
     * REFERENCE_HIGH sort values.
     */
    REFERENCE_HIGH("Reference: Highest first");

    /**
     * The private value of values.
     */
    private String values;


    /**
     * Constructor.
     *
     * @param nameValues this is name of values.
     */
    SortValues(final String nameValues) {
        this.values = nameValues;
    }

    /**
     * Gets values.
     *
     * @return the values.
     */
    public String getValues() {
        return values;
    }
}
