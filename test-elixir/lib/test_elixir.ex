defmodule TestElixir do
  @moduledoc """
  Example module using the Jason library.
  """

  def hello do
    %{hello: "world"} |> Jason.encode!()
  end
end
