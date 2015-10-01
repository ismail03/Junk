package com.stc.echannels.epayments.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.stc.echannels.epayments.model.SrvTypes;

/**
 * The persistence interface for the srv types service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ahmed_fadlus
 * @see SrvTypesPersistenceImpl
 * @see SrvTypesUtil
 * @generated
 */
public interface SrvTypesPersistence extends BasePersistence<SrvTypes> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link SrvTypesUtil} to access the srv types persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the srv types in the entity cache if it is enabled.
    *
    * @param srvTypes the srv types
    */
    public void cacheResult(com.stc.echannels.epayments.model.SrvTypes srvTypes);

    /**
    * Caches the srv typeses in the entity cache if it is enabled.
    *
    * @param srvTypeses the srv typeses
    */
    public void cacheResult(
        java.util.List<com.stc.echannels.epayments.model.SrvTypes> srvTypeses);

    /**
    * Creates a new srv types with the primary key. Does not add the srv types to the database.
    *
    * @param serviceTypeId the primary key for the new srv types
    * @return the new srv types
    */
    public com.stc.echannels.epayments.model.SrvTypes create(long serviceTypeId);

    /**
    * Removes the srv types with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param serviceTypeId the primary key of the srv types
    * @return the srv types that was removed
    * @throws com.stc.echannels.epayments.NoSuchSrvTypesException if a srv types with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SrvTypes remove(long serviceTypeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSrvTypesException;

    public com.stc.echannels.epayments.model.SrvTypes updateImpl(
        com.stc.echannels.epayments.model.SrvTypes srvTypes)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the srv types with the primary key or throws a {@link com.stc.echannels.epayments.NoSuchSrvTypesException} if it could not be found.
    *
    * @param serviceTypeId the primary key of the srv types
    * @return the srv types
    * @throws com.stc.echannels.epayments.NoSuchSrvTypesException if a srv types with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SrvTypes findByPrimaryKey(
        long serviceTypeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.stc.echannels.epayments.NoSuchSrvTypesException;

    /**
    * Returns the srv types with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param serviceTypeId the primary key of the srv types
    * @return the srv types, or <code>null</code> if a srv types with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.stc.echannels.epayments.model.SrvTypes fetchByPrimaryKey(
        long serviceTypeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the srv typeses.
    *
    * @return the srv typeses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SrvTypes> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the srv typeses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SrvTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of srv typeses
    * @param end the upper bound of the range of srv typeses (not inclusive)
    * @return the range of srv typeses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SrvTypes> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the srv typeses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.stc.echannels.epayments.model.impl.SrvTypesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of srv typeses
    * @param end the upper bound of the range of srv typeses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of srv typeses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.stc.echannels.epayments.model.SrvTypes> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the srv typeses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of srv typeses.
    *
    * @return the number of srv typeses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
