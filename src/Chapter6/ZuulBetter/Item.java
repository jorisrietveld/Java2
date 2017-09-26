package ZuulBetter;

/**
 * Author: Joris Rietveld <jorisrietveld@gmail.com>
 * Created: 27-09-2017 00:26
 * Licence: GPLv3 - General Public Licence version 3
 */
public class Item
{
    /**
     * The Description.
     */
    public String description;
    /**
     * The Weight.
     */
    public int weight;


    /**
     * Instantiates a new Item.
     *
     * @param description the description
     * @param weight      the weight
     */
    public Item(String description, int weight)
    {
        this.description = description;
        this.weight = weight;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public int getWeight()
    {
        return weight;
    }

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(int weight)
    {
        this.weight = weight;
    }
}
