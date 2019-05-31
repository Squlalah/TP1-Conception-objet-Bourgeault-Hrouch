/* This file was generated by SableCC (http://www.sablecc.org/). */

package tp6.node;

import tp6.analysis.*;

@SuppressWarnings("nls")
public final class AOperatorlogiqueOperator extends POperator
{
    private POperatorlogique _operatorlogique_;

    public AOperatorlogiqueOperator()
    {
        // Constructor
    }

    public AOperatorlogiqueOperator(
        @SuppressWarnings("hiding") POperatorlogique _operatorlogique_)
    {
        // Constructor
        setOperatorlogique(_operatorlogique_);

    }

    @Override
    public Object clone()
    {
        return new AOperatorlogiqueOperator(
            cloneNode(this._operatorlogique_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOperatorlogiqueOperator(this);
    }

    public POperatorlogique getOperatorlogique()
    {
        return this._operatorlogique_;
    }

    public void setOperatorlogique(POperatorlogique node)
    {
        if(this._operatorlogique_ != null)
        {
            this._operatorlogique_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._operatorlogique_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._operatorlogique_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._operatorlogique_ == child)
        {
            this._operatorlogique_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._operatorlogique_ == oldChild)
        {
            setOperatorlogique((POperatorlogique) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
