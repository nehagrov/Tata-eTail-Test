/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 25 Feb, 2015 2:51:04 PM                     ---
 * ----------------------------------------------------------------
 */
package org.training.core.jalo;

import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.product.Product;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;

/**
 * Generated class for type {@link org.training.core.jalo.TrainingApparelProduct TrainingApparelProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTrainingApparelProduct extends Product
{
	/** Qualifier of the <code>TrainingApparelProduct.genders</code> attribute **/
	public static final String GENDERS = "genders";
	/** Qualifier of the <code>TrainingApparelProduct.productLevel</code> attribute **/
	public static final String PRODUCTLEVEL = "productLevel";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(Product.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(GENDERS, AttributeMode.INITIAL);
		tmp.put(PRODUCTLEVEL, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingApparelProduct.genders</code> attribute.
	 * @return the genders - List of genders that the ApparelProduct is designed for
	 */
	public List<EnumerationValue> getGenders(final SessionContext ctx)
	{
		List<EnumerationValue> coll = (List<EnumerationValue>)getProperty( ctx, GENDERS);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingApparelProduct.genders</code> attribute.
	 * @return the genders - List of genders that the ApparelProduct is designed for
	 */
	public List<EnumerationValue> getGenders()
	{
		return getGenders( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingApparelProduct.genders</code> attribute. 
	 * @param value the genders - List of genders that the ApparelProduct is designed for
	 */
	public void setGenders(final SessionContext ctx, final List<EnumerationValue> value)
	{
		setProperty(ctx, GENDERS,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingApparelProduct.genders</code> attribute. 
	 * @param value the genders - List of genders that the ApparelProduct is designed for
	 */
	public void setGenders(final List<EnumerationValue> value)
	{
		setGenders( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingApparelProduct.productLevel</code> attribute.
	 * @return the productLevel
	 */
	public String getProductLevel(final SessionContext ctx)
	{
		return (String)getProperty( ctx, PRODUCTLEVEL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TrainingApparelProduct.productLevel</code> attribute.
	 * @return the productLevel
	 */
	public String getProductLevel()
	{
		return getProductLevel( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingApparelProduct.productLevel</code> attribute. 
	 * @param value the productLevel
	 */
	public void setProductLevel(final SessionContext ctx, final String value)
	{
		setProperty(ctx, PRODUCTLEVEL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TrainingApparelProduct.productLevel</code> attribute. 
	 * @param value the productLevel
	 */
	public void setProductLevel(final String value)
	{
		setProductLevel( getSession().getSessionContext(), value );
	}
	
}
