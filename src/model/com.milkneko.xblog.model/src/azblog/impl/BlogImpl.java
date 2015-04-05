/**
 */
package azblog.impl;

import azblog.Author;
import azblog.Blog;
import azblog.ModelPackage;
import azblog.Post;
import azblog.Tag;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link azblog.impl.BlogImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link azblog.impl.BlogImpl#getPosts <em>Posts</em>}</li>
 *   <li>{@link azblog.impl.BlogImpl#getBaseURL <em>Base URL</em>}</li>
 *   <li>{@link azblog.impl.BlogImpl#getName <em>Name</em>}</li>
 *   <li>{@link azblog.impl.BlogImpl#getAutores <em>Autores</em>}</li>
 *   <li>{@link azblog.impl.BlogImpl#getDefaultAuthor <em>Default Author</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlogImpl extends MinimalEObjectImpl.Container implements Blog {
	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * The cached value of the '{@link #getPosts() <em>Posts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosts()
	 * @generated
	 * @ordered
	 */
	protected EList<Post> posts;

	/**
	 * The default value of the '{@link #getBaseURL() <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURL()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseURL() <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURL()
	 * @generated
	 * @ordered
	 */
	protected String baseURL = BASE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAutores() <em>Autores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutores()
	 * @generated
	 * @ordered
	 */
	protected EList<Author> autores;

	/**
	 * The cached value of the '{@link #getDefaultAuthor() <em>Default Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultAuthor()
	 * @generated
	 * @ordered
	 */
	protected Author defaultAuthor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BLOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, ModelPackage.BLOG__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Post> getPosts() {
		if (posts == null) {
			posts = new EObjectContainmentEList<Post>(Post.class, this, ModelPackage.BLOG__POSTS);
		}
		return posts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseURL() {
		return baseURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseURL(String newBaseURL) {
		String oldBaseURL = baseURL;
		baseURL = newBaseURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BLOG__BASE_URL, oldBaseURL, baseURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BLOG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Author> getAutores() {
		if (autores == null) {
			autores = new EObjectContainmentEList<Author>(Author.class, this, ModelPackage.BLOG__AUTORES);
		}
		return autores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author getDefaultAuthor() {
		if (defaultAuthor != null && defaultAuthor.eIsProxy()) {
			InternalEObject oldDefaultAuthor = (InternalEObject)defaultAuthor;
			defaultAuthor = (Author)eResolveProxy(oldDefaultAuthor);
			if (defaultAuthor != oldDefaultAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BLOG__DEFAULT_AUTHOR, oldDefaultAuthor, defaultAuthor));
			}
		}
		return defaultAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author basicGetDefaultAuthor() {
		return defaultAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultAuthor(Author newDefaultAuthor) {
		Author oldDefaultAuthor = defaultAuthor;
		defaultAuthor = newDefaultAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BLOG__DEFAULT_AUTHOR, oldDefaultAuthor, defaultAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.BLOG__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case ModelPackage.BLOG__POSTS:
				return ((InternalEList<?>)getPosts()).basicRemove(otherEnd, msgs);
			case ModelPackage.BLOG__AUTORES:
				return ((InternalEList<?>)getAutores()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.BLOG__TAGS:
				return getTags();
			case ModelPackage.BLOG__POSTS:
				return getPosts();
			case ModelPackage.BLOG__BASE_URL:
				return getBaseURL();
			case ModelPackage.BLOG__NAME:
				return getName();
			case ModelPackage.BLOG__AUTORES:
				return getAutores();
			case ModelPackage.BLOG__DEFAULT_AUTHOR:
				if (resolve) return getDefaultAuthor();
				return basicGetDefaultAuthor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.BLOG__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case ModelPackage.BLOG__POSTS:
				getPosts().clear();
				getPosts().addAll((Collection<? extends Post>)newValue);
				return;
			case ModelPackage.BLOG__BASE_URL:
				setBaseURL((String)newValue);
				return;
			case ModelPackage.BLOG__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.BLOG__AUTORES:
				getAutores().clear();
				getAutores().addAll((Collection<? extends Author>)newValue);
				return;
			case ModelPackage.BLOG__DEFAULT_AUTHOR:
				setDefaultAuthor((Author)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.BLOG__TAGS:
				getTags().clear();
				return;
			case ModelPackage.BLOG__POSTS:
				getPosts().clear();
				return;
			case ModelPackage.BLOG__BASE_URL:
				setBaseURL(BASE_URL_EDEFAULT);
				return;
			case ModelPackage.BLOG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.BLOG__AUTORES:
				getAutores().clear();
				return;
			case ModelPackage.BLOG__DEFAULT_AUTHOR:
				setDefaultAuthor((Author)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.BLOG__TAGS:
				return tags != null && !tags.isEmpty();
			case ModelPackage.BLOG__POSTS:
				return posts != null && !posts.isEmpty();
			case ModelPackage.BLOG__BASE_URL:
				return BASE_URL_EDEFAULT == null ? baseURL != null : !BASE_URL_EDEFAULT.equals(baseURL);
			case ModelPackage.BLOG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.BLOG__AUTORES:
				return autores != null && !autores.isEmpty();
			case ModelPackage.BLOG__DEFAULT_AUTHOR:
				return defaultAuthor != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (baseURL: ");
		result.append(baseURL);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BlogImpl
