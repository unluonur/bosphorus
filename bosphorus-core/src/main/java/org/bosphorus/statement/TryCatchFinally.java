package org.bosphorus.statement;

public class TryCatchFinally<TInput> implements IStatement<TInput> {
	private IStatement<TInput> stTry;
	private IStatement<Exception> stCatch;
	private IStatement<TInput> stFinally;
	
	public TryCatchFinally(IStatement<TInput> stTry, IStatement<Exception> stCatch, IStatement<TInput> stFinally) {
		this.stTry = stTry;
		this.stCatch = stCatch;
		this.stFinally = stFinally;
	}

	@Override
	public void execute(TInput input) throws Exception {
		try {
			stTry.execute(input);
		}
		catch(Exception ex) {
			stCatch.execute(ex);
		}
		finally {
			if(stFinally != null) {
				stFinally.execute(input);	
			}
		}
	}

}
